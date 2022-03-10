package com.acsia.svp.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acsia.svp.model.CustomerVehicle;
import com.acsia.svp.service.CustomerVehicleService;
import com.acsia.svp.vo.CustomerVehicleVO;

@Component
public class CustomerVehicleDelegate {
	@Autowired
	CustomerVehicleService customerVehicleService;
	
	
	public CustomerVehicle create(CustomerVehicleVO cv) {
		CustomerVehicle cv1=customerVehicleService.create(cv);
		return cv1;
	}
	public List<CustomerVehicle> getAll(){
		return customerVehicleService.getAll();
		
	}
	public void deleteAll() {
		customerVehicleService.deleteAll();
	}

}
