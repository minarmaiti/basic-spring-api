package com.minarmaiti.basicspringapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minarmaiti.basicspringapi.entity.UserEntity;
import com.minarmaiti.basicspringapi.repository.UserRepository;
import com.minarmaiti.basicspringapi.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository UserRepository;

	@Override
	public List<UserEntity> getAllUser() {
		return UserRepository.findAll();
	}

	@Override
	public UserEntity getUserById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity saveUser(UserEntity userEntity) {
		return UserRepository.save(userEntity);
	}

}
