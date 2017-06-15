package com.example.blog.mapper;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Select;

import com.example.blog.entity.User;

/**
 * 
 * @author 26046
 *
 */
public interface UserMapper {

	@Select("select * from user")
	public ArrayList<User> getAll();
}
