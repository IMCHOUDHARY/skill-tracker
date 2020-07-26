package com.skill.dto;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Team {
	@Id
	public Integer teamId; 
	public String teamName;
	
	public List<Skills> skills;
	
	public Domain domain;
}
