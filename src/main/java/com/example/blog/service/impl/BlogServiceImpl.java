package com.example.blog.service.impl;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blog.entity.BlogEntity;
import com.example.blog.mapper.BlogMapper;
import com.example.blog.service.BlogService;

/**
 * 
 * @author 26046
 *
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService{

	@Autowired
	private BlogMapper blogMapper;
	
	public ArrayList<BlogEntity> getAll() {
		return blogMapper.getAll();
	}

	public ArrayList<BlogEntity> getPage(HashMap<String, Integer> map) {
		return blogMapper.getPage(map);
	}

}
