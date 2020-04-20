package com.spring.boot.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.model.Employee;
import com.spring.boot.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;
	public Employee save(Employee emp)
	{
		return repo.save(emp);
	}
	public Employee getEmployee(int empId)
	{
		return repo.getOne(empId);
	}
	
	public List<Employee> getAllEmployee()
	{
		return repo.findAll();
	}
	
	public void deleteEmployee(int empId)
	{
		repo.deleteById(empId);
	}
	
	public Employee getEmployeeByName(String name)
	{
		return repo.getByName(name);
	}
	
	public void UpdateEmployee(float sal,int empId)
	{
		repo.UpdateEmp(sal, empId);
		
	}
}
