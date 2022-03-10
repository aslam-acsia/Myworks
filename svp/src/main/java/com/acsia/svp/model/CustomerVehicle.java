package com.acsia.svp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer_vehicle")
public class CustomerVehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	@ManyToOne
	@JoinColumn(name="customerId")
	private Customer customerId;
	@ManyToOne
	@JoinColumn(name="vehicleId")
	private Vehicle vehicleId;
	public CustomerVehicle() {}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	public Vehicle getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(Vehicle vehicleId) {
		this.vehicleId = vehicleId;
	}
	
}
