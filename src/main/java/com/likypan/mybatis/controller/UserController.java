package com.likypan.mybatis.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.likypan.mybatis.entity.User;
import com.likypan.mybatis.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user",method = RequestMethod.GET)
	@ResponseBody
	public User getUserByUsername(@RequestParam String username,HttpServletRequest request){
		return userService.getUserByUsername(username);
	}
}
