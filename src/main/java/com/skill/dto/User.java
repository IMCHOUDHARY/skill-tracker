package com.skill.dto;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "Users")
@Data
public class User {
	@Id
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private long mobile;
	
	private List<Skills> skills;
}
