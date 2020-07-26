package com.skill.dto;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
public class Skills {

	private String skillName;
	private int skillValue;
	private String skillLevel;
	private String remark;
	
	private List<Team> teamName;
	
	private Category skillCategory;
	
	private SkillType skillType;
	private int skillExperience;
}
