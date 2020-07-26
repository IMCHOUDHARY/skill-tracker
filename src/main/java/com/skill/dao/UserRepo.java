package com.skill.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.skill.dto.User;

@Repository
public interface UserRepo extends MongoRepository<User, String> {
	
//	@Query
//	public List<User> findUserByFirstName(String firstName);
//	@Query
//	public User findUserByEmail(String email);
//	@Query
//	public User findUserByMobileNumber(long mobile);
//	@Query
//	public List<User> findUserByTeamName(String team);
//	@Query
//	public List<User> findUserByCategory(String category);
//	@Query
//	public List<User> findUserBySkillType(String category);
}
