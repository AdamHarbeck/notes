package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.revature.clients.UserClient;
import com.revature.dtos.UserDTO;
import com.revature.models.Task;
import com.revature.repositories.TaskRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController()
public class TaskController {

	private TaskRepository tr;
	private Environment env;
	private UserClient uc;
	
	@Autowired
	public TaskController(TaskRepository tr, Environment env, UserClient uc) {
		this.tr = tr;
		this.env = env;
		this.uc = uc;
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
	
	@CircuitBreaker(name="uc", fallbackMethod ="fallbackExample")
	@GetMapping("/{id}/users")
	public ResponseEntity<List<UserDTO>> findUsersById(@PathVariable("id") int id){
		
		Task task = tr.findById(id).orElse(null);
		
		if(task == null) {
			return ResponseEntity.notFound().build();
		}
		
		List<UserDTO> users = this.uc.findUsersByTaskId(id);
		
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
	
	public ResponseEntity<String> fallbackExample(Exception e){
		return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("User service is currently unavailable.");
	}
	
}
