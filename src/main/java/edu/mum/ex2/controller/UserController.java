package edu.mum.ex2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.ex2.dao.DAO;
import edu.mum.ex2.dao.GenericDao;
import edu.mum.ex2.dao.UserDaoImpl;
import edu.mum.ex2.domain.User;



@Controller
public class UserController {
	@Autowired
	private DAO dAO;
	
	@Autowired
	private UserDaoImpl userDaoImpl;
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}
	
	public String login() {
		
		return "login";
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getAllProject()
	{
		System.out.println("Inside contrtoller");
	
		User user = new User();
		userDaoImpl.create(user);
		User returnedUser = userDaoImpl.readById(1);
		System.out.println("This is tesign "+returnedUser.getName());
		return "welcome";
	}

}
