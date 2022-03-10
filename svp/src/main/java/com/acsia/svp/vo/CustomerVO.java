package com.acsia.svp.vo;

public class CustomerVO {
	 private String name;
	 private int age;
	 private String address;
	 private String email;
	 private long phone;
	 private long[] vehicleId;
	 public CustomerVO(){}
	 public CustomerVO(String name,int age,String address,String email,long phone,long[] vehicleId){
		 this.name=name;
		 this.age=age;
		 this.address=address;
		 this.email=email;
		 this.phone=phone;
		 this.vehicleId=vehicleId;
		 
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public long[] getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(long[] vehicleId) {
		this.vehicleId = vehicleId;
	}
	

}
