package com.employee.application.Service;
import com.employee.application.Service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class EmployeeApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Autowired
	private EmployeeService employeeService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Hello World");

		String newEmployee = employeeService.getNewEmployee();
		System.out.println(newEmployee);
		List<String> employeesList = employeeService.getNewEmployee(100);
		for(String employee: employeesList){
			System.out.println(employee);
		}

	}
}
