package service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("managerbean")
public class ManagerService implements EmployeeService {

	public String calculateSalary() {
		return "Manager's salary is 5000";
	}

}
