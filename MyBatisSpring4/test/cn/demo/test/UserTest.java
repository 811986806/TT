package cn.demo.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.demo.entity.User;
import cn.demo.service.UserService;

public class UserTest {
	
	@Test
	public void testAddUser(){
		String resource = "applicationContext-mybatis.xml";
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(resource);
		UserService userService = 
				(UserService)context.getBean("userService");
		User user = new User();
		user.setUserCode("admin23");
		user.setUserName("admin23");
		Integer result = userService.addUser(user);
		System.out.println(result);
	}

	//@Test
	public void testGetUserList(){
		String resource = "applicationContext-mybatis.xml";
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(resource);
		UserService userService = 
				(UserService)context.getBean("userService");
		List<User> userList = 
				userService.getUserList();
		System.out.println(userList.size());
	}
	
	
	
	
}
