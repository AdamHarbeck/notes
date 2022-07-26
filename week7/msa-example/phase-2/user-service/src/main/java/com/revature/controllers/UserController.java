package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.models.Role;
import com.revature.models.Task;
import com.revature.models.User;
import com.revature.repositories.RoleRepository;
import com.revature.repositories.UserRepository;

@RestController
//@RequestMapping("/users")
public class UserController {

	private UserRepository ur;
	private RoleRepository rr;
	private RestTemplate rt;
	
	@Autowired
	public UserController(UserRepository ur, RoleRepository rr, RestTemplate rt) {
		this.ur = ur;
		this.rr = rr;
		this.rt = rt;
	}
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> users = ur.findAll();
		
		if(users.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(users);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable("id") int id){
		User user = ur.findById(id).orElse(null);
		
		if(user == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(user);
	}
	
	@PostMapping
	public ResponseEntity<User> insert(@RequestBody User user){
		// Service logic, setting/overriding values to defaults
		Role basicUser = new Role();
		basicUser.setId(2);

		user.setId(0);
		user.setRole(basicUser);
		
		ur.save(user);
		
		return ResponseEntity.status(201).body(user);
	}
	
	@GetMapping("/tasks")
	public ResponseEntity<List<Task>> findTasks(){
//		List<Task> tasks = this.rt.getForObject("http://localhost:8080/tasks", List.class);
		List<Task> tasks = this.rt.getForObject("http://tasks", List.class);
		
		if(tasks.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(tasks);
	}
}
