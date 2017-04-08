package com.hsyq.service;

import java.util.List;

import com.hsyq.pojo.User;

public interface UserService {

	User getUserById(long id) throws Exception;
	List<User> list() throws Exception;
	
}
