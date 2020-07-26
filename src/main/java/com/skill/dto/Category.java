package com.skill.dto;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
public class Category {
	@Id
	public Integer categoryId;
	public String category;
}
