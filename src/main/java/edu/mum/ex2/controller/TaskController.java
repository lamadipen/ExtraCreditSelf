package edu.mum.ex2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.mum.ex2.dao.TaskDaoImpl;
import edu.mum.ex2.domain.Project;
import edu.mum.ex2.domain.Task;
import edu.mum.ex2.domain.User;

@Controller
public class TaskController {

	@Autowired
	private TaskDaoImpl taskDaoImpl;

	public TaskController() {
		// TODO Auto-generated constructor stub
	}

	public String login() {

		return "login";
	}

	@RequestMapping(value = "/task", method = RequestMethod.GET)
	public String getTaksForm() {
		return "serviceOffer";
	}

	@RequestMapping(value = "/task", method = RequestMethod.POST)
	public String submitTaksForm(@ModelAttribute("SpringWeb") Task t, ModelMap model) {
		System.out.println("Inside contrtoller");
		Task task = new Task();
		User user = new User();
		user.setUser_id(1);
		Project project = new Project();
		project.setProj_id(1);
		task.setName("Mum Event");
		task.setStatus("Complete");
		task.setDuration("2");
		//task.setUser(user);
		taskDaoImpl.create(task);
		return "redirect:/task";
	}

}
