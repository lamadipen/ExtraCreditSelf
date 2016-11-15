package edu.mum.ex2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProjectController {

	public ProjectController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/all_project")
	public String listAllProject()
	{
		
		
		ModelAndView model = new ModelAndView("index");
		model.addObject("listProject", list);

		return model;
		//return back to index.jsp
	}

}
