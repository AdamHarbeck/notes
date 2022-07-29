package com.revature.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.revature.dtos.TaskDTO;

@FeignClient(name="tasks")
public interface TaskClient {

	@GetMapping("/port") // generate code to make an http request to the tasks service for the getPort() endpoint
	public String getPort();
	
	@GetMapping("/users/{id}")
	public List<TaskDTO> getTaskByUserId(@PathVariable("id")int id);
}
