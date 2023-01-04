package com.assignment.smarte;


import com.assignment.smarte.Service.EmployeeService;
//import com.assignment.smarte.Service.Impl.EmployeeImpl;
import com.assignment.smarte.entities.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


import java.util.List;
import java.util.Scanner;


@SpringBootApplication
@ComponentScan(basePackages = "com.assignment.smarte.Service")
public class SmarteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmarteApplication.class, args);

	}
}
