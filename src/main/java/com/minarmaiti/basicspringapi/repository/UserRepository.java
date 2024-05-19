package com.minarmaiti.basicspringapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minarmaiti.basicspringapi.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
