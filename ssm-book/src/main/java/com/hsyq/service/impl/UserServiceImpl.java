package com.hsyq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsyq.dao.UserMapper;
import com.hsyq.pojo.User;
import com.hsyq.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserById(long id) {
		User user = userMapper.selectByPrimaryKey(id);
		System.out.println(user);
		return user;
	}
}
