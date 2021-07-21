package in.practice.ajinkya.service;

import java.util.List;

import in.practice.ajinkya.model.Employee;

public interface IEmployeeService {

	Integer saveEmployee(Employee emp);
	List<Employee> getAllEmployees();
	void deleteEmployee(Integer id);
}
