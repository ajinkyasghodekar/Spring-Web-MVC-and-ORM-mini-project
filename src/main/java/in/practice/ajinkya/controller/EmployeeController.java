package in.practice.ajinkya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import in.practice.ajinkya.service.IEmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private IEmployeeService service;
}
