package com.employemodel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employe 
{
@Id
private int id;
private String name;
private String addr;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}

}
