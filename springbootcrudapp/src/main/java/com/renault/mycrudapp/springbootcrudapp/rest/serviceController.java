package com.renault.mycrudapp.springbootcrudapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.renault.mycrudapp.springbootcrudapp.model.users_data;
import com.renault.mycrudapp.springbootcrudapp.service.userService;

@RestController
@RequestMapping("/users")
public class serviceController {

	@Autowired
	private userService userService;
	
	@GetMapping("/getUsers")
	public List<users_data> getUsers() {
		return userService.findAllUsers();
	}
	
	@GetMapping("/getUserbyID/{id}")
	public users_data getUserbyID(@PathVariable(name="id") int id ) {
		return userService.getOne(id);
	}
	
	@GetMapping("/getUserbyName")
	public users_data getUserbyName(@RequestParam (name="id") int id) {
		return userService.getOne(id);
	}
	
	@PostMapping("/saveUser")
	public users_data saveUser(@RequestBody users_data user) {
		return userService.save(user);
	}
}
