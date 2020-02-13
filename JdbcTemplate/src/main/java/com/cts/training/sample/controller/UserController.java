package com.cts.training.sample.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.sample.dao.UserDao;
import com.cts.training.sample.model.User;

public class UserController {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("./context.xml");
		UserDao userDao=(UserDao) context.getBean("userDaoImp");
		
	
		/*
		 * User user=new User(3,"Supriya","NRT");
		 * System.out.println(userDao.saveUser(user)); System.out.println(user);
		 */
		 
		
		
		 User user1=userDao.getUserById(1);
		 boolean query=userDao.deleteUser(user1);
		  if(query)
		  { 
			  System.out.println("Deleted"); 
		  } 
		  else
		 System.out.println("Failure");
		 
		// user1.setName("Prasannasvvl");
		/*
		 * boolean query=userDao.UpdateUser(user1); if(query) {
		 * System.out.println("Sucess"); } else System.out.println("Failure");
		 */
		 // System.out.println(userDao.getAllUsers());
	}

}
