package com.skill.dto;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Category {
	@Id
	public Integer categoryId;
	public String category;
}
