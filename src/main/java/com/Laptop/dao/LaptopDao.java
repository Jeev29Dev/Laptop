package com.Laptop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Laptop.entity.Laptop;
import com.Laptop.repository.LaptopRepository;

@Repository
public class LaptopDao {
	@Autowired
	LaptopRepository lr;
public String postAll(List <Laptop> l) {
	lr.saveAll(l);
	return "DATA POSTED SUCCESSFULLY";
}
public List<Laptop> getvalues() {
	return lr.findAll();
}
public List<Laptop> getThis(String a) {
	return lr.getThis(a);
}
public List<Laptop> getprice() {
	return lr.getprice();
}
public List<Laptop> getsize(float a,float b) {
	return lr.getsize(a,b);
}
public List<Laptop> getname(int a) {
	return lr.getname(a);
}
public List<Laptop> getram() {
	return lr.getram();
}
public List<Laptop> getorder() {
	return lr.getorder();
}
public int getmin() {
	return lr.getmin();
}
public List<Laptop> getmax() {
	return lr.getmax();
}
public List<Object> getobject() {
	return lr.getobject();
}
public List<Laptop> getp(int p) {
	return lr.getp(p);
}
public List<Laptop> getjr(float x,float y) {
	return lr.getjr(x,y);
}
public List<Laptop> getmp() {
	return lr.getmp();
}
public List<Laptop> getmn() {
	return lr.getmn();
}
public List<Laptop> getxname(String a) {
 return lr.getxname(a);
}
}


