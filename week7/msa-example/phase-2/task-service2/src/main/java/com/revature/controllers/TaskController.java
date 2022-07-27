package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.models.Task;
import com.revature.models.User;
import com.revature.repositories.TaskRepository;

@RestController()
public class TaskController {

	private TaskRepository tr;
	private RestTemplate rt;
	private Environment env;
	
	@Autowired
	public TaskController(TaskRepository tr, RestTemplate rt, Environment env) {
		this.tr = tr;
		this.rt = rt;
		this.env = env;
	}
	
	@GetMapping
	public ResponseEntity<List<Task>> findAll(){
		List<Task> tasks = tr.findAll();
		
		if(tasks.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(tasks);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Task> findById(@PathVariable("id") int id){
		Task task = tr.findById(id).orElse(null);
		
		if(task == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(task);
	}
	
	@GetMapping("/{id}/users")
	public ResponseEntity<List<User>> findUsersById(@PathVariable("id") int id){
		
		Task task = tr.findById(id).orElse(null);
		
		if(task == null) {
			return ResponseEntity.notFound().build();
		}
		
		List<User> users = this.rt.getForObject("http://users/tasks/" + id, List.class);
		
		if(users.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(users);
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<List<Task>> findByUserId(@PathVariable("id") int id){
		
		List<Task> tasks = tr.findAllByUsers_Id(id);
		
		return ResponseEntity.ok(tasks);
	}
	
	@GetMapping("/port")
	public String getPort() {
		String port = env.getProperty("local.server.port");
		
		return "Task service running on port: " + port;
	}
}
