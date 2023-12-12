package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.student.entity.Student;
import com.student.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService studentSerive;
	
	
	@RequestMapping(value = "/set-student",method = RequestMethod.POST)
	public String setStudent(@RequestParam int id,@RequestParam String name,@RequestParam String contact) {
		
		studentSerive.setStudent(id, name, contact);
		
		return "display.jsp";
		
	}
	
	@RequestMapping(value = "/show-all-records",method = RequestMethod.GET)
	public ModelAndView getAllData() {
		List<Student> allData = studentSerive.getAllData();
		ModelAndView mav = new ModelAndView();
		mav.addObject("alldata", allData);
		mav.setViewName("viewdata.jsp");
		return mav;
	}
}
