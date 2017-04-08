package com.hsyq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsyq.pojo.User;
import com.hsyq.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/{id}")
	@ResponseBody
	public User getUserById(@PathVariable("id") long id) throws Exception {
		User user = userService.getUserById(id);
		System.out.println(user);
		return user;
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public List<User> findUserList() throws Exception{
		List<User> list = userService.list();
		System.out.println(list);
		return list;
	}
	
	
}
