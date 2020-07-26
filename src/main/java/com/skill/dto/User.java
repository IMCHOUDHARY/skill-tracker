package com.skill.dto;


import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "Users")
@Data
public class User {
	@Id
	private Integer userId;
	private String firstName;
	private String lastName;
	private String email;
	private long mobile;
	
	private List<Skills> skills;
}
