package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.models.Task;
import com.revature.models.User;
import com.revature.services.UserService;
import com.revature.util.ConnectionUtil;

public class TaskPostgres implements TaskDAO {

	private static Logger log = LogManager.getLogger(TaskPostgres.class);
	
	@Override
	public Task createTask(Task t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> retrieveTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task retrieveTaskById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> retrieveTasksByUserId(int id) {
		String sql = "select t.id, t.description, t.due_date, t.status, t.user_assigned_id , u.username from tasks t join users u on t.user_assigned_id = u.id where user_assigned_id = ?;";
		List<Task> tasks = new ArrayList<>();
		
		try(Connection c = ConnectionUtil.getConnectionFromEnv()){
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Task t = new Task();
				t.setId(rs.getInt("id"));
				t.setDescription(rs.getString("description"));
				t.setDueDate(rs.getDate("due_date").toLocalDate()); // rs.getDate returns a date that we have to convert to a local date
				t.setStatus(rs.getString("status"));
				
				User u = new User();
				u.setId(rs.getInt("user_assigned_id"));
				u.setUsername(rs.getString("username"));
				
				t.setUserAssigned(u);
				
				tasks.add(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tasks;
	}

	@Override
	public boolean updateTask(Task t) {
		// TODO Auto-generated method stub
		return false;
	}

}
