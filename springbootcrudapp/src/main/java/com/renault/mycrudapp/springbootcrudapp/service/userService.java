package com.renault.mycrudapp.springbootcrudapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renault.mycrudapp.springbootcrudapp.model.users_data;
import com.renault.mycrudapp.springbootcrudapp.repository.userRepository;

@Service
public class userService {

	@Autowired
	private userRepository userRepo;
	
	public List<users_data> findAllUsers(){
		return userRepo.findAll();
	}
	
	public users_data getOne(int id) {
		return userRepo.findById(id).orElse(null);
	}
	
	public users_data save(users_data user) {
		return userRepo.save(user);
	}
	
	/*public users_data getOnebyName(String name) {
		return userRepo.findOne(name).orElse(null);
	}
	*/
	
}
