package com.acsia.svp.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acsia.svp.model.Vehicle;
import com.acsia.svp.service.VehicleService;

@Component
public class VehicleDelegate {
	
	@Autowired
	VehicleService vehicleService;
	
	public Vehicle createVehicle(Vehicle vehicle){
		vehicle = vehicleService.createVehicle(vehicle);
		return vehicle;
		
}
	public List<Vehicle> getAllVehicles(){
		List<Vehicle> vehicles= vehicleService.getAllVehicles();
		return vehicles;
	}
	public Vehicle getVehicleById(long id) {
		Vehicle vehicle=vehicleService.getVehicleById(id);
		return vehicle;
	}
	public boolean deleteVehicle(long id) {
		boolean status=vehicleService.deleteVehicle(id);
		return status;
	}
	public boolean deleteAllVehicles() {
		boolean status=vehicleService.deleteAllVehicles();
		return status;
	}
}