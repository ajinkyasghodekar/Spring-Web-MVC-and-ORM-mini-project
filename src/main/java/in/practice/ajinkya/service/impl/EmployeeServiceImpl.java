package in.practice.ajinkya.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.practice.ajinkya.dao.IEmployeeDao;
import in.practice.ajinkya.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao dao; //HSA-S
}
