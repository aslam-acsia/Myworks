package com.acsia.svp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Vehicles")

public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long vehicleId;
	@Column(name="type")
	private int type;
	@Column(name="modelyear")
	private int modelyear;
	@Column(name="bodytype")
	private String bodytype;
	@Column(name="colour")
	private String colour;
	@Column(name="platenumber")
	private String platenumber;
	public Vehicle() {
		}
	public Vehicle(int type,int modelyear,String bodytype,String colour,String platenumber) {
		this.type=type;
		this.modelyear=modelyear;
		this.bodytype=bodytype;
		this.colour=colour;
		this.platenumber=platenumber;
	}
	public long getvehicleId() {
		return vehicleId;
	}
	public void setvehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getModelyear() {
		return modelyear;
	}
	public void setModelyear(int modelyear) {
		this.modelyear = modelyear;
	}
	public String getBodytype() {
		return bodytype;
	}
	public void setBodytype(String bodytype) {
		this.bodytype = bodytype;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getPlatenumber() {
		return platenumber;
	}
	public void setPlatenumber(String platenumber) {
		this.platenumber = platenumber;
	}
}
