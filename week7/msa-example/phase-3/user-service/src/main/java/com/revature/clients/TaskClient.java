package com.revature.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="tasks")
public interface TaskClient {

	@GetMapping("/port") // generate code to make an http request to the tasks service for the getPort() endpoint
	public String getPort();
}
