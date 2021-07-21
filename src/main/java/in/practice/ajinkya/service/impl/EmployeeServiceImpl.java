package in.practice.ajinkya.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.practice.ajinkya.dao.IEmployeeDao;
import in.practice.ajinkya.model.Employee;
import in.practice.ajinkya.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao dao; //HAS-S
	
	@Transactional
	public Integer saveEmployee(Employee emp) {
		//calculations
		double sal = emp.getEmpSal();
		
		emp.setEmpHra(sal * 25/100.0);
		emp.setEmpTa(sal * 12/100.0);
		
		/*int id = dao.saveEmployee(emp);
		return id;*/
		return dao.saveEmployee(emp);
	}
	
	@Transactional(readOnly = true)
	public List<Employee> getAllEmployees() {
		List<Employee> list = dao.getAllEmployees();
		/*Collections.sort(
				list, 
				(e1,e2)->e1.getEmpName().compareTo(e2.getEmpName())
				);*/
		
		return list;
	}
	
	@Transactional
	public void deleteEmployee(Integer id) {
		dao.deleteEmployee(id);
	}
}
