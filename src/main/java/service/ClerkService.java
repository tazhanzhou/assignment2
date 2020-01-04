package service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("clerkbean")
public class ClerkService implements EmployeeService {

	public String calculateSalary() {
		return "Clerk's salary is 5000";
	}

}
