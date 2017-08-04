package com.example.blog.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.blog.entity.BlogEntity;

/**
 * 
 * @author 26046
 *
 */
public interface BlogService {

	/**
	 * 获取全部日志
	 * @return
	 */
	public ArrayList<BlogEntity> getAll();
	
	public ArrayList<BlogEntity> getPage(HashMap<String, Integer> map);
}
