package com.example.blog.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.blog.entity.BlogEntity;
import com.example.blog.entity.DataResult;
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
//		ArrayList<BlogEntity> blogs = blogService.getAll();
		HashMap<String, Integer> page = new HashMap<String, Integer>();
		page.put("index", 0);
		page.put("num", 5);
		ArrayList<BlogEntity> blogs = blogService.getPage(page);
		for(BlogEntity blog : blogs){
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:SS");
			blog.setShowDate(sdf.format(blog.getSendDate()));;
		}
		map.put("blogs", blogs);
		map.put("page", 1);
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("/getBlogs")
	public DataResult getBlogs(@RequestParam String index){
		DataResult result = new DataResult();
		System.out.println(index);
		
		HashMap<String, Integer> page = new HashMap<String, Integer>();
		page.put("index", (Integer.parseInt(index)-1)*5);
		page.put("num", 5);
		ArrayList<BlogEntity> blogs = blogService.getPage(page);
		for(BlogEntity blog : blogs){
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:SS");
			blog.setShowDate(sdf.format(blog.getSendDate()));;
		}
		result.setData(blogs);
		return result;
	}
}
