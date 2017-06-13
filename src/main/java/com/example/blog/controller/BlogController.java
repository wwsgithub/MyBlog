package com.example.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.mapper.UserMapper;

@Controller
public class BlogController {

	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/index")
	public String index(){
		System.out.println(userMapper.getAll().get(0).toString());
		return "index";
	}
}
