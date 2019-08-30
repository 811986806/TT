package cn.demo.dao;

import java.util.List;

import cn.demo.entity.User;

public interface UserMapper {
	
	public List<User> getUserList();
	
	public Integer addUser(User user);
}
