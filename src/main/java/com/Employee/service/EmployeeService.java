package com.Employee.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.dao.EmployeeDao;
import com.Employee.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;

	public String postThis(Employee e) {
		return ed.postThis(e);
}
	public List<Employee> getvalues() {
		return ed.getvalues();
	}
	public String postAll(List<Employee> ee) {
		return ed.postAll(ee);
	}
	public String empId(int aa) {
		return ed.empId(aa);
	}
	
	
	public List<Employee> getAge() {
		List<Employee> x=ed.getvalues();
		List<Employee> fList=x.stream().filter(y->y.getAge()>22).collect(Collectors.toList());
		return fList;
	}
	public List<String> getName(int c) {
		List<Employee>n=ed.getvalues();
		List<String> withId=n.stream().filter(x->x.getId()==c).map(y->y.getName()).collect(Collectors.toList());
		return withId;
	}
	public Integer getMax() {
		List<Employee> x=ed.getvalues();
		Integer fmax=x.stream().filter(y->y.getGender().equals("male")).map(z->z.getAge()).max(Comparable::compareTo).get();
		return fmax;
	}
	public List<Employee> getFulldetail(int c) {
		List<Employee>n=ed.getvalues();
		List<Employee> withIddetail=n.stream().filter(x->x.getId()==c).collect(Collectors.toList());
		return withIddetail;
	}
	public List<Employee> getreverse() {
		List<Employee> x=ed.getvalues();
		List<Employee> reverse=x.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).collect(Collectors.toList());
		return reverse;
	}
	public List<Employee> getfirst() {
		List<Employee> x=ed.getvalues();
		List<Employee> first=x.stream().sorted(Comparator.comparingInt(Employee::getSalary)).limit(1).collect(Collectors.toList());
		return first;
	}
	public List<Employee> getbetween(int a,int b) {
		List<Employee>x=ed.getvalues();
		List<Employee> num=x.stream().filter(y->y.getAge()>a && y.getAge()<b).collect(Collectors.toList());
		return num;
	}
	public List<Employee> getThis(String a) {
		return ed.getThis(a);
	}
	
}


