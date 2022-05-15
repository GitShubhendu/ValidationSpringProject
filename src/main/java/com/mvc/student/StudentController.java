package com.mvc.student;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {
	/*
	 * @RequestMapping("/showForm") public String showForm(Model theModel) {
	 * System.out.println("hi"); theModel.addAttribute("student", new Student());
	 * return"student_form"; }
	 */
	 @RequestMapping("/showForm")
	 public ModelAndView showForm(ModelAndView mv) {
		 System.out.println("inside showform method"); 
		 mv.setViewName("student_form");
		 return mv.addObject("student", new Student());
		
		  }
	@RequestMapping("/processForm")
	//public String processFormForm( @Valid @ModelAttribute("student") Student theStudent,BindingResult br) {	
	public String submitForm(@Valid  @ModelAttribute("student") Student theStudent, BindingResult br) {
	System.out.println("inside "+theStudent.getStudentLastName());
	System.out.println("inside processFormForm method"+br.hasErrors()+br.hasFieldErrors());
		if(br.hasErrors()) {
			return "student_form";
		}
		return"confirmation_form";
	
	}
}
