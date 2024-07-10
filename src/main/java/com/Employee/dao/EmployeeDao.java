package com.Employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Employee.entity.Employee;
import com.Employee.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired 
	EmployeeRepository er;
	public String postThis(Employee e) {
		er.save(e);
		return"Posted Successfully";
		}
	public List<Employee> getvalues() {
		return er.findAll();
	}
	public String postAll(List<Employee> ee) {
		er.saveAll(ee);
		return "Posted in Successfully";
	}
	public String empId(int aa) {
		 er.deleteById(aa);
		return "Given ID details deleted";
	}
	public List<Employee> getThis(String a) {
		return er.getThis(a);
	}
}



