package com.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.entity.Employee;
import com.Employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
    EmployeeService es;

	@PostMapping(value = "/postemp")
	public String postThis(@RequestBody Employee e) {
		return es.postThis(e);
	}
	@GetMapping(value ="/getemp")
	public List<Employee>getvalues() {
		return es.getvalues();
	}
	@PostMapping(value="/postemp1")
    public String postAll(@RequestBody List<Employee> ee) {
    	return es.postAll(ee);
    }
	@DeleteMapping(value="/de/{aa}")
    public String empId(@PathVariable ("aa")int aa) {
    	return es.empId(aa);
    }
	
	
	@GetMapping(value ="/getempAge")
	public List<Employee>getAges() {
		return es.getAge();
}
	@GetMapping(value ="/getempIdName/{c}")
	public List<String> getNames (@PathVariable ("c")int c) {
		
		return es.getName(c);
}
	@GetMapping(value ="/getmax") 
	public Integer getmax() {
		return es.getMax();
	}
	@GetMapping(value ="/getempIddetail/{c}")
	public List<Employee> getFulldetail (@PathVariable ("c")int c) {
		
		return es.getFulldetail(c);
}
	@GetMapping(value ="/getsalary") 
	public List<Employee> getreverse() {
		return es.getreverse();
}
	@GetMapping(value ="/getone") 
	public List<Employee> getfirst() {
		return es.getfirst();
	}
	@GetMapping(value ="/getbetween/{a}/{b}")
	public List<Employee> getbetween (@PathVariable ("a")int a,@PathVariable ("b")int b) {
		return es.getbetween(a,b);
	}
	@GetMapping(value="/getsql/{a}")
	public List<Employee> getThis(@PathVariable ("a")String a) {
		return es.getThis(a);
	}
}



