package com.acsia.svp.vo;

public class VehicleVO {
	private int type;
	private String colour;
	private String bodytype;
	private int modelyear;
	private String platenumber;
	private long customerId;
	public VehicleVO() {}
	public VehicleVO(int type,String colour,String bodytype,int modelyear,String platenumber,long customerId) {
		this.type=type;
		this.colour=colour;
		this.bodytype=bodytype;
		this.modelyear=modelyear;
		this.platenumber=platenumber;
		this.customerId=customerId;
		
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getBodytype() {
		return bodytype;
	}
	public void setBodytype(String bodytype) {
		this.bodytype = bodytype;
	}
	public int getModelyear() {
		return modelyear;
	}
	public void setModelyear(int modelyear) {
		this.modelyear = modelyear;
	}
	public String getPlatenumber() {
		return platenumber;
	}
	public void setPlatenumber(String platenumber) {
		this.platenumber = platenumber;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	

}
