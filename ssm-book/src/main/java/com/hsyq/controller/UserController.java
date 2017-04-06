package com.hsyq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsyq.pojo.User;
import com.hsyq.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/{id}")
	@ResponseBody
	public User getUserById(@PathVariable("id") long id) {
		User user = userService.getUserById(id);
		System.out.println(user);
		return user;
	}
	
	@RequestMapping("/aaa")
	public String getName(){
		return "user";
	}
	
	@RequestMapping("/aa")
	public String showIndex(){
		return "protal/index";
	}
	
}
