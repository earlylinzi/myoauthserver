package com.early.example.oauthserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class IndexController {
	
	
		
		@RequestMapping("/index")
		public String toShowUser(){
			
//			ModelAndView mv = new ModelAndView("index");
			
			return "yyyyyyyyyyyyyyyyyyy";
		}

}
