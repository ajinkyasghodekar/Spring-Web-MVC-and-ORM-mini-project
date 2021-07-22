package in.practice.ajinkya.dao;

import java.util.List;

import in.practice.ajinkya.model.Employee;

public interface IEmployeeDao {

	   Integer saveEmployee(Employee emp);
	   List<Employee> getAllEmployees();
	   void deleteEmployee(Integer id);
	   
	   Employee getOneEmployee(Integer id);
	   void updateEmployee(Employee emp);
	}
