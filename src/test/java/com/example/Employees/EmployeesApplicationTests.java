package com.example.Employees;

import com.example.Employees.models.Employee;
import com.example.Employees.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee Bob = new Employee("Bob",25, 100, "bob@gmail.com");
		employeeRepository.save(Bob);
	}

}
