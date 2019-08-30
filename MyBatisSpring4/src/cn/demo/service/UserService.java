package cn.demo.service;

import java.util.List;

import cn.demo.entity.User;

public interface UserService {
	public List<User> getUserList();
	public Integer addUser(User user);
}
