package com.likypan.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.likypan.mybatis.dao.UserMapper;
import com.likypan.mybatis.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserByUsername(String username) {
		return userMapper.findByUsername(username);
	}

	
	
}
