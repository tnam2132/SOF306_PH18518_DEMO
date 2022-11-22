package com.demo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.beans.Student;

@Controller
public class StudentController {
	@GetMapping("/student/form")
	public String form(Model model) {
		Student student = new Student();
		student.setGender(true);
		student.setFullname("Nam");
		student.setCountry("VN");
		model.addAttribute("sv", student);
		return "student/form";
	}
	
	@GetMapping("/validate/form")
	public String validate_form(Model model) {
		Student student = new Student();
		model.addAttribute("sv", student);
		return "student/form";
	}
	
	@PostMapping("/student/save")
	public String save(Model model, @ModelAttribute("sv") Student studen  ) {
		return "student/success";
	}
}
