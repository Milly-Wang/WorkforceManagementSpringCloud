package com.spring.boot;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
	@Before("execution(* com.spring.boot.service.EmployeeService.deleteEmployee(..))")
	public void showDeleteLog() {
		System.out.println("deleting employee details....");
	}

}
