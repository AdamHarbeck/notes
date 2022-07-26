package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Task;
import com.revature.repositories.TaskRepository;

@RestController()
@RequestMapping("/tasks")
public class TaskController {

	private TaskRepository tr;
	
	@Autowired
	public TaskController(TaskRepository tr) {
		this.tr = tr;
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
}
