package com.Laptop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="laptoplist")
@Entity
public class Laptop {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
private int id;
private String company;
private String name;
private String ram;
private String model;
private float screensize;
private boolean istouchscreen;
private boolean iswireless;
private int price;

public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRam() {
	return ram;
}
public void setRam(String ram) {
	this.ram = ram;
}
public float getScreensize() {
	return screensize;
}
public void setScreensize(float screensize) {
	this.screensize = screensize;
}
public boolean isIstouchscreen() {
	return istouchscreen;
}
public void setIstouchscreen(boolean istouchscreen) {
	this.istouchscreen = istouchscreen;
}
public boolean isIswireless() {
	return iswireless;
}
public void setIswireless(boolean iswireless) {
	this.iswireless = iswireless;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}



