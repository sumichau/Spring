package com.cg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.model.Employee;
@Controller
public class EmployeeController {
	
	@RequestMapping(method=RequestMethod.GET,value="/show")
	public String showEmployee(Model model)
	{
		
		
		Employee e=new Employee();
		List<Employee> aa=new ArrayList<Employee>();
		
		aa.add(new Employee(1,"ss","hr",45555d));
		aa.add(new Employee(2,"ss","hr",45555d));
		
		
		model.addAttribute("list",aa);
		
		return "show";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/addEmp")
	public String addEmployee(Model model)
	{
		return "index";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/editemp")
	public String editEmployee(Model model)
	{
		Employee e=new Employee();
		List<Employee> aa=new ArrayList<Employee>();
		
		aa.add(new Employee(1,"ss","hr",45555d));
		aa.add(new Employee(2,"ss","hr",45555d));
		
		
		model.addAttribute("list",aa);
		model.addAttribute("msg","updated successfully");
		return "show";
	}

}
