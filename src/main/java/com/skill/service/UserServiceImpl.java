package com.skill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skill.dao.UserRepo;
import com.skill.dto.User;

@Service
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
		//return userRepo.findUserByFirstName(firstName);
		return null;
	}

	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		//return userRepo.findUserByEmail(email);
		return null;
	}

	@Override
	public User getByMobileNumber(long mobile) {
		// TODO Auto-generated method stub
		//return userRepo.findUserByMobileNumber(mobile);
		return null;
	}

	@Override
	public List<User> getByTeamName(String team) {
		// TODO Auto-generated method stub
		//return userRepo.findUserByTeamName(team);
		return null;
	}

	@Override
	public List<User> getByCategory(String category) {
		// TODO Auto-generated method stub
		//return userRepo.findUserByCategory(category);
		return null;
	}

	@Override
	public List<User> getBySkillType(String category) {
		// TODO Auto-generated method stub
		//return userRepo.findUserBySkillType(category);
		return null;
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
		return userRepo.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		//userRepo.deleteById(userId);
	}

}
