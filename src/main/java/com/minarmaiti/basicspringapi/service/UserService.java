package com.minarmaiti.basicspringapi.service;

import java.util.List;

import com.minarmaiti.basicspringapi.entity.UserEntity;

public interface UserService {
	
	public List<UserEntity> getAllUser();
	
	public UserEntity getUserById();
	
	public UserEntity saveUser(UserEntity userEntity);
	

}
