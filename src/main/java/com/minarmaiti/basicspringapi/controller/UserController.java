package com.minarmaiti.basicspringapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minarmaiti.basicspringapi.entity.UserEntity;
import com.minarmaiti.basicspringapi.service.UserService;

@RestController
@RequestMapping("/v1/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public List<UserEntity> getAllUser() {
		return userService.getAllUser();
	}
	
	@PostMapping
	public UserEntity saveUser(@RequestBody UserEntity userEntity) {
		return userService.saveUser(userEntity);
	}

}
