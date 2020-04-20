package com.spring.boot.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.boot.model.Employee;
import com.spring.boot.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	/*
	 * @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate dob1;
	 */
	
	@PostMapping("/employee")
	public String saveEmployee(@ModelAttribute Employee emp,Model m)
	{
		Employee saveEmp=service.save(emp);
		m.addAttribute("emp",saveEmp);
		return "view";
		
	}
	
	@GetMapping("/ename")
	public String EmployeeDetailsByName(@RequestParam("empName") String empName,Model m)
	{
		   Employee empname=service.getEmployeeByName(empName);
		   m.addAttribute("empn",empname);
		   return "view";
	}
	
	@GetMapping("/empbyid")
	public String getEmployee(@RequestParam("empId") int empid,Model m)
	{
	   Employee empname=service.getEmployee(empid);
	   m.addAttribute("empn",empname);
	   return "view";
    }

	@PostMapping("delete")
	public String deleteEmployee(@RequestParam("empid")int empId,Model m)
	{
		Employee emp=service.getEmployee(empId);
		service.deleteEmployee(empId);
	    m.addAttribute("empd",emp);
		return "deletedemp";
	}
	
	@PostMapping("/getAll")
	public String getAllEmployee(Model m)
	{
		List<Employee> empList=service.getAllEmployee();
		m.addAttribute("Allemp",empList);	
		return "getAllEmp";	
	}
	
	@PostMapping("/update")
	public String update(@RequestParam("empid") int empId,Model m)
	{
		Employee emp=service.getEmployee(empId);
		if(emp!=null)
		{
			m.addAttribute("empid",empId);
		    return "updateemp";
		}
		else
			return "failure";
	}
	
	@GetMapping("/updateemp")
	public String updatemp(@ModelAttribute Employee emp,@RequestParam("empid")int empId,Model m)
	{
		service.UpdateEmployee(emp.getSalary(),empId);
		return "successful";

	}
	
}