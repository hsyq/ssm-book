package com.hsyq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsyq.dao.UserMapper;
import com.hsyq.pojo.User;
import com.hsyq.pojo.UserExample;
import com.hsyq.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserById(long id) throws Exception{
		User user = userMapper.selectByPrimaryKey(id);
		System.out.println(user);
		return user;
	}

	@Override
	public List<User> list() throws Exception {
		//如果不需要任何查询条件,直接将example对象new出来即可
		UserExample example = new UserExample();
		List<User> list = userMapper.selectByExample(example);
		return list;
	}
}
