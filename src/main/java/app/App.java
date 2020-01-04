package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import employee.Employee;
//import service.ClerkService;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//context.scan("assignment2.service");
		context.scan("service");
		//context.scan("assignment2.employee");
		context.scan("employee");
		context.refresh();
		

		//Employee clerk = context.getBean(Employee.class);
		//clerk.salary();
		
		Employee manager = context.getBean(Employee.class);
		manager.salary();
		
		context.close();

	}
}
