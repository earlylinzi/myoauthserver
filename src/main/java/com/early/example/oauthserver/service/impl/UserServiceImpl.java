package com.early.example.oauthserver.service.impl;


import com.early.example.oauthserver.dao.UserMapper;
import com.early.example.oauthserver.domain.User;
import com.early.example.oauthserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @ClassName: BuserServiceImpl   
 * @Description: 用户管理
 * @author: WANG
 * @date 2017年4月11日 上午11:09:16
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public User selectByPrimaryKey(Integer uid) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(uid);

	}

	public String addString() {
		// TODO Auto-generated method stub
		return "userServiceAddString";
	}

	
}
