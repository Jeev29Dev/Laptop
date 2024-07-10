package com.Laptop.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.naming.NameNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Laptop.dao.LaptopDao;
import com.Laptop.entity.Laptop;

@Service
public class LaptopService {
@Autowired
LaptopDao ld;
public String postAll(List <Laptop> l) {
	return ld.postAll(l);
	}
public List<Laptop> getvalues() {
	return ld.getvalues();
}
public List<Laptop> getThis(String a) {
	return ld.getThis(a);
}
public List<Laptop> getprice() {
	return ld.getprice();
}
public List<Laptop> getsize(float a,float b) {
	return ld.getsize(a,b);
}
public List<Laptop> getname(int a) {
	return ld.getname(a);
}
public List<Laptop> getram() {
	return ld.getram();
}
public List<Laptop> getorder() {
	return ld.getorder();
}
public int getmin() {
	return ld.getmin();
}
public List<Laptop> getmax() {
	return ld.getmax();
}
public List<Object> getobject() {
	return ld.getobject();
}
public List<Laptop> getp(int p) {
	return ld.getp(p);
}
public List<Laptop> getjr(float x,float y) {
	return ld.getjr(x,y);
}
public List<Laptop> getmp() {
	return ld.getmp();
}
public List<Laptop> getmn() {
	return ld.getmn();
} 
public List<Laptop> getfirst() {
	List<Laptop> x=ld.getvalues();
	List<Laptop> first=x.stream().sorted(Comparator.comparingInt(Laptop::getPrice)).limit(1).collect(Collectors.toList());
	return first;
}
public List<Laptop> getfname() {
	List<Laptop> x=ld.getvalues();
	List<Laptop> firstN=x.stream().sorted(Comparator.comparingInt(Laptop::getName)).limit(3).collect(Collectors.toList());
	return firstN;
}	
public List<Laptop> getxname(String a) throws NameNotFoundException {
	if(ld.getxname(a).isEmpty()) {
		throw new NameNotFoundException("Invalid Entry");
	}
	else {
		return ld.getxname(a);
	}
}
}



