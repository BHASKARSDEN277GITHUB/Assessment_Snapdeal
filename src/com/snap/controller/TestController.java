package com.snap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class TestController {
	
	@RequestMapping("/AddAssessment")
	public void addAssessment(){
		//add assessment here
	}
	@RequestMapping("/DeleteAssessment")
	public void deleteAssessment(){
		//delete assessment here and return new JSON
	}
	@RequestMapping("/DisplayAssessmentList")
	public void displayAssessmentList(){
		//return JSON object of Assessments all the assessments
	}
	
	@RequestMapping("/index")
	public ModelAndView showIndex(){
		//add assessment here
		System.out.println("i am here");
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
	@RequestMapping("/")
	public ModelAndView defaultMap(){
		//add assessment here
		System.out.println("i am here");
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
}
