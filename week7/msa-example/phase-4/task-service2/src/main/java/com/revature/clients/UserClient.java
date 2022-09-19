package com.revature.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.revature.dtos.UserDTO;

@FeignClient(name="users")
public interface UserClient {

	@GetMapping("/tasks/{id}")
	List<UserDTO> findUsersByTaskId(@PathVariable("id") int id);
}
