package com.revature.models;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Task {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String description;
	@Enumerated(EnumType.STRING)
	private Status status;
}
