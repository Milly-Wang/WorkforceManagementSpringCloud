package com.spring.boot.repository;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.boot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Query("from Employee where empName=:name")
	public Employee getByName(String name);
	
	@Transactional
	@Modifying
	@Query("update Employee set salary=:sal where empId=:empId")
	public void UpdateEmp(float sal,int empId);
	
	

}
