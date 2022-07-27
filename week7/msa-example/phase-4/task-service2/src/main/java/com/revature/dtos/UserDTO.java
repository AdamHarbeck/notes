package com.revature.dtos;

import lombok.Data;

@Data
public class UserDTO {
	private int id;
	private String name;
	private RoleDTO role;
}
