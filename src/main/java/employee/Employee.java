package employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import service.EmployeeService;

@Component("employee")
public class Employee {

	public Employee() {
	}
	
	@Autowired
	//@Qualifier("clerkbean")
	@Qualifier("managerbean")
	EmployeeService employeeService;
	
	public void salary() {
		System.out.println(employeeService.calculateSalary());
	}

}
