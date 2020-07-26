package com.skill.dto;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
public class Team {
	@Id
	public Integer teamId; 
	public String teamName;
	
	public List<Skills> skills;
	
	public Domain domain;
}
