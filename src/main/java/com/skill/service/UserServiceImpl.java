package com.skill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.skill.dao.UserRepo;
import com.skill.dto.User;

public class UserServiceImpl implements UserService {

	private UserRepo userRepo;
	
	@Autowired
	public UserServiceImpl(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	@Override
	public List<User> getByFirstName(String firstName) {
		return userRepo.findUserByFirstName(firstName);
	}

	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepo.findUserByEmail(email);
	}

	@Override
	public User getByMobileNumber(long mobile) {
		// TODO Auto-generated method stub
		return userRepo.findUserByMobileNumber(mobile);
	}

	@Override
	public List<User> getByTeamName(String team) {
		// TODO Auto-generated method stub
		return userRepo.findUserByTeamName(team);
	}

	@Override
	public List<User> getByCategory(String category) {
		// TODO Auto-generated method stub
		return userRepo.findUserByCategory(category);
	}

	@Override
	public List<User> getBySkillType(String category) {
		// TODO Auto-generated method stub
		return userRepo.findUserBySkillType(category);
	}

	@Override
	public List<User> getByRange(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getCountByExpertSkill() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getCountByIntermediateSkill() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getCountByBeginnerSkill(String category) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getCountCategories() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getCountTeams() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub

	}

}
