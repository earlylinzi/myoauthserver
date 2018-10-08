package com.early.example.oauthserver.controller;

import com.alibaba.fastjson.JSON;
import com.early.example.oauthserver.domain.User;
import com.early.example.oauthserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


/**
 * 
 * @ClassName: LoginController   
 * @Description: 登录controller
 * @Description:跳转到登录界面
 */

@RequestMapping("/user")
@RestController
public class UserController{
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/showUser")
	public String toShowUser(){
//		User user = userService.selectByPrimaryKey(1);
//		String string = userService.addString();
//		ModelAndView mv = new ModelAndView("user01");
//		mv.addObject("user", user);
//		mv.addObject("ok", "ok01");
//		mv.addObject("string", string);
//		System.out.println(user.getUid());
//		System.out.println(user.getUname());
//		System.out.println(user.getUpassword());
//		System.out.println(user.getUemail());
		return "kkkkkkkkkkkkkkkkkkkkkkkkkkkkk";
	}
	
	
	
}