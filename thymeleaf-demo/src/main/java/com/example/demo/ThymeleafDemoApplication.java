package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;


@SpringBootApplication

public class ThymeleafDemoApplication {
	
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafDemoApplication.class, args);
	}

	
	//class EmployeeCommand implements CommandLineRunner
	//{

		//@Override
		//public void run(String... args) throws Exception {
			//List<Employee> list=new ArrayList<Employee>();
			//Employee tempEmployee=new Employee();
			//tempEmployee.setId(1);
			//tempEmployee.setFirstName("swarna");
			//tempEmployee.setLastName("Acharya");
			//tempEmployee.setEmail("swarna@gmail.com");
			//list.add(tempEmployee);
			//employeeRepository.save(tempEmployee);
			
		//}
	//}
}
