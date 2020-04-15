package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Trainee;
import com.example.demo.service.TraineeService;


@Controller
public class TraineeController {

	@Autowired
	TraineeService service;
	

	@GetMapping("/addTrainee")
	public String showAddTraineePage()
	{
		return "addTrainee";
	}
	
	@PostMapping("/add")
	public ModelAndView addTrainee(@ModelAttribute("trainee") Trainee trainee){
			service.addTrainee(trainee);
			return new ModelAndView("addTrainee","trainee",trainee);
					
	 }
	
	@GetMapping("/retrieveTrainee")
	public String showRetrievePage()
	{
	      return "retrieveTrainee"; 	
	}
	
	@GetMapping("/retrieve")
	public ModelAndView getTraineeById(@RequestParam("traineeId") int id)
	{ 
		  
	      return new ModelAndView("retrieveTrainee","trainee", service.getTraineeById(id));
	}
		
	@GetMapping("/deleteTrainee")
	public String showDeleteTraineePage()
	{
	      return "deleteTrainee"; 	
	}
	
	@RequestMapping("/delete")
	public String deleteTrainee(@RequestParam("traineeId") int traineeId)
	{
		 service.deleteTrainee(traineeId);
	   	 return "traineeManagementPage";
	}
	
	@GetMapping("/retrieveAllTrainee")
	public ModelAndView showRetrieveAllTraineesPage()
	{
		return new ModelAndView("retrieveAllTrainee","traineeList",service.getAllTrainees());
	}
	
	@GetMapping("/modifyTrainee")
	public String showModifyTraineePage()
	{	
		return "modifyTrainee";
	}
	
	@RequestMapping("/modify")
	public ModelAndView updateTrainee(@RequestParam int traineeId)
	{	
		  Trainee trainee=service.getTraineeById(traineeId);
		  return new ModelAndView("modify1","trainee",trainee); 
	}
	
	@RequestMapping("/update")
	public String updateTrainee1(@ModelAttribute Trainee trainee)
	{
	    	   service.updateTrainee(trainee);
	    	  return "traineeManagementPage"; 
	}
	
}
