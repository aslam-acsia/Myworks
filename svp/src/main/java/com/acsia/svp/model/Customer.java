package com.acsia.svp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customers")


public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long customerId;
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="phone")
	private long phone;
	@Column(name="address")
	private String address;
	@Column(name="email")
	private String email;
	public Customer() {
	}
	public Customer(String name,int age,long phone,String address,String email) {
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.address=address;
		this.email=email;
	}
	public long getcustomerId() {
		return customerId;
	}
	public void setcustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
