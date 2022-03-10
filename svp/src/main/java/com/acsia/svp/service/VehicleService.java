package com.acsia.svp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acsia.svp.model.Vehicle;
import com.acsia.svp.repository.VehicleRepository;

@Component
public class VehicleService {
	@Autowired
	VehicleRepository vehicleRepository;
	public Vehicle createVehicle(Vehicle vehicle) {
		try {
			vehicle = vehicleRepository.saveAndFlush(vehicle);


		} catch (Exception e) {
			e.printStackTrace();

		}
		return vehicle;
	}
	public List<Vehicle> getAllVehicles() {
		try {
			List<Vehicle> vehicles = new ArrayList<Vehicle>();
			vehicleRepository.findAll().forEach(vehicles::add);
			return vehicles;
		} catch (Exception e) {
			return null;

		}

	}
	public Vehicle getVehicleById(long id) {
		Optional<Vehicle> vehicle = vehicleRepository.findById(id);
		if (vehicle.isPresent()) {
			return vehicle.get();
		} else {
			return null;
		}
	}
	public boolean deleteVehicle(long id) {
		try {
			vehicleRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean deleteAllVehicles() {
		try {
			vehicleRepository.deleteAll();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
