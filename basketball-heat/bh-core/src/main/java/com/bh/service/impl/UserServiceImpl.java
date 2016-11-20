package com.bh.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bh.api.UserApi;
import com.bh.dao.UserDao;
import com.bh.model.User;
import com.bh.service.UserService;

/**
 *UserApi对外接口，例如提供给第三方公司
 * @author Allen
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService,UserApi {
	@Resource
	private UserDao userDao;
	
	public int insertUser(User user) {
		
		return userDao.insertUser(user);
	}

}
