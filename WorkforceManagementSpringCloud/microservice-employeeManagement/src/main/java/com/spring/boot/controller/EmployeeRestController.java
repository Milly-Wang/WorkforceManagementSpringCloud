//package com.spring.boot.controller;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.format.annotation.DateTimeFormat;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.spring.boot.model.Employee;
//import com.spring.boot.service.EmployeeService;
//
//@RestController
//@RequestMapping("/api")
//public class EmployeeRestController {
//
//	
//		@Autowired
//		EmployeeService service;
//		
//		/*
//		 * @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate dob1;
//		 */
//		
//
//		@PostMapping("/save")
//		public Employee saveEmployee(@RequestBody Employee emp) throws Exception{
//			return service.save(emp);
//		}
//		
//		@GetMapping("/employees/{empId}")
//		public Employee getemp(@PathVariable("empId") int empId) throws Exception
//		{
//		   return service.getEmployee(empId);
//	     }
//	@DeleteMapping("/employee/{empId}")
//		public void delete(@PathVariable("empId")int empId) throws Exception
//		{
//		service.deleteEmployee(empId);
//		}
//		
//		@GetMapping("/employees")
//		public List<Employee> getAllEmp() throws Exception
//		{
//			return service.getAllEmployee();
//			
//		}
//
//		@PutMapping("/updating/{empId}")
//		public void updateEmployee(@PathVariable("empId")int empId,@RequestBody Employee emp) throws Exception
//		{
//			
//			service.UpdateEmployee(emp.getSalary(),empId);
//				
//
//		}
//		
//		
//		
//	}
//
//
