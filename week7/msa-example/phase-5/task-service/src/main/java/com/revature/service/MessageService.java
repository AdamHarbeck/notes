package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.revature.events.UserChangeEvent;
import com.revature.models.Task;
import com.revature.models.User;
import com.revature.repositories.TaskRepository;

@Service
public class MessageService {

	private KafkaTemplate<String, UserChangeEvent> kt;
	private TaskRepository tr;

	@Autowired
	public MessageService(KafkaTemplate<String, UserChangeEvent> kt, TaskRepository tr) {
		super();
		this.kt = kt;
		this.tr = tr;
	}

	@KafkaListener(topics = "users")
	public void processEvent(UserChangeEvent event) {
		switch (event.getOperation()) {
		case CREATE:
			System.out.println("UserChangeEvent - Create " + event.getUserId());
			break;
		case UPDATE:
			System.out.println("UserChangeEvent - Update " + event.getUserId());
			// retrieve all the tasks to be updated from the event
			List<Task> tasksOld= tr.findAllByUsers_Id(event.getUserId());
			List<Task> tasks = event.getTasks();

			// iterate over all of the tasks
			for (Task task : tasks) {
				// retrieve existing task
				task = tr.findById(task.getId()).orElse(null);

				// retrieve the list of users currently assigned
				List<User> users = task.getUsers();

				User user = new User();
				user.setId(event.getUserId());

				// add the user to the list if it's not currently present
				if (!users.contains(user)) {
					users.add(user);
					task.setUsers(users);
					System.out.println();
					// save
					tr.save(task);
				}
			}
			
			List<T>
			break;
		case DELETE:
			System.out.println("UserChangeEvent - Delete " + event.getUserId());
			break;
		}
	}

}
