package com.likypan.mybatis.dao;

import com.likypan.mybatis.entity.User;

public interface UserMapper {
	
	public User findByUsername(String username);

}
