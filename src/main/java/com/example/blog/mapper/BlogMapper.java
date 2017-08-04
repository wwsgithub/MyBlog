package com.example.blog.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Select;

import com.example.blog.entity.BlogEntity;

/**
 * 
 * @author 26046
 *
 */
public interface BlogMapper {

	@Select("select * from article")
	public ArrayList<BlogEntity> getAll();
	
	@Select("select * from article limit #{index},#{num}")
	public ArrayList<BlogEntity> getPage(HashMap<String, Integer> map);
}
