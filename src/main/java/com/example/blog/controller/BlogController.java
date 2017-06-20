package com.example.blog.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.blog.entity.BlogEntity;
import com.example.blog.mapper.UserMapper;
import com.example.blog.service.BlogService;

/**
 * Blog
 * @author 26046
 *
 */
@Controller
public class BlogController {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private BlogService blogService;
	
	@RequestMapping("/index")
	public String index(HashMap<String, Object> map){
//		System.out.println(userMapper.getAll().get(0).toString());
//		HashMap<String, Object> map = new HashMap<String, Object>();
		ArrayList<BlogEntity> blogs = blogService.getAll();
		for(BlogEntity blog : blogs){
			System.out.println(blog.getSendDate());
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:SS");
			blog.setShowDate(sdf.format(blog.getSendDate()));;
		}
		map.put("blogs", blogs);
		return "index";
	}
}
