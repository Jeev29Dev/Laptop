package com.Laptop.controller;

import java.util.List;

import javax.naming.NameNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Laptop.entity.Laptop;
import com.Laptop.service.LaptopService;

@RestController
public class LaptopController {
@Autowired
LaptopService ls;

@PostMapping (value="/postLcdetail") 
	public String postAll(@RequestBody List <Laptop> l) {
		return ls.postAll(l);
}
@GetMapping (value="/getLc")
public List<Laptop> getvalues() {
	return ls.getvalues();
}
@GetMapping(value="/getvnamesql/{a}")
public List<Laptop> getThis(@PathVariable ("a")String a) {
	return ls.getThis(a);
}
@GetMapping(value="/getvpricesql")
public List<Laptop> getprice() {
	return ls.getprice();
}
@GetMapping(value="/getvsizesql/{a}/{b}")
public List<Laptop> getsize(@PathVariable ("a")float a,@PathVariable ("b")float b) {
	return ls.getsize(a,b);
}
@GetMapping(value="/getvname/{a}")
public List<Laptop> getname(@PathVariable ("a")int a) {
	return ls.getname(a);
}
@GetMapping(value="/getvram")
public List<Laptop> getram() {
	return ls.getram();
}
@GetMapping(value="/getvorder")
public List<Laptop> getorder() {
	return ls.getorder();
}
@GetMapping(value="/getvminprice")
public int getmin() {
	return ls.getmin();
}
@GetMapping(value="/getvmaxprice")
public List<Laptop> getmax() {
	return ls.getmax();
}
@GetMapping(value="/getvobject")
public List<Object> getobject() {
	return ls.getobject();
}
@GetMapping(value="/getjjp/{p}")
public List<Laptop> getp(@PathVariable ("p")int p) {
	return ls.getp(p);
}
@GetMapping(value="/getvjr/{x}/{y}")
public List<Laptop> getjr(@PathVariable ("x")float x, @PathVariable ("y")float y) {
	return ls.getjr(x,y);
}
@GetMapping(value="/getmp")
public List<Laptop> getmp() {
	return ls.getmp();
}
@GetMapping(value="/getmn")
public List<Laptop> getmn() {
	return ls.getmn();
}
@GetMapping(value="/getvxname/{a}")
public List<Laptop> getxname(@PathVariable String a) throws NameNotFoundException {
	return ls.getxname(a);
}
}



