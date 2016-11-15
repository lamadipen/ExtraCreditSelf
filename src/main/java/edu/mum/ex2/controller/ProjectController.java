package edu.mum.ex2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.mum.ex2.dao.ProjectDaoImpl;
import edu.mum.ex2.domain.Project;

@Controller
public class ProjectController {
	@Autowired
	private ProjectDaoImpl projectDaoImpl;
	
	public ProjectController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/all_project")
	public ModelAndView listAllProject()
	{	
		ModelAndView model = new ModelAndView("listProject");
		List<Project> list = projectDaoImpl.readAll();
		model.addObject("listProject", list);
		return model;
		//return back to index.jsp
	}

}
