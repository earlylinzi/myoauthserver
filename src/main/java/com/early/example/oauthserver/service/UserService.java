package com.early.example.oauthserver.service;


import com.early.example.oauthserver.domain.User;

public interface UserService {

	User selectByPrimaryKey(Integer uid);
	
	String addString();
}
