package com.acsia.svp.vo;

public class CustomerVehicleVO {
	private long customerId;
	private long vehicleId;
	
	public CustomerVehicleVO() {}
	public CustomerVehicleVO(long customerId,long vehicleId) {
		this.customerId=customerId;
		this.vehicleId=vehicleId;
	}
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}
	

}
