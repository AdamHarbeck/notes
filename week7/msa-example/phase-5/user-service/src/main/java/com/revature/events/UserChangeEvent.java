package com.revature.events;

import java.time.LocalDateTime;
import java.util.List;

import com.revature.models.Task;

import lombok.Data;

@Data
public class UserChangeEvent {

	private int userId;
	private List<Task> tasks;
	private Operation operation;
	private LocalDateTime timestamp;
	
}
