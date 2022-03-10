package com.acsia.svp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acsia.svp.delegate.VehicleDelegate;
import com.acsia.svp.model.Vehicle;

@RestController
@RequestMapping("/api")
public class VehicleController {
	@Autowired
	VehicleDelegate vehicleDelegate;
	@PostMapping("/vehicles")
	public ResponseEntity<Vehicle> createVehicle(@RequestBody Vehicle vehicle) {
			vehicle = vehicleDelegate.createVehicle(vehicle);
			return new ResponseEntity<>(vehicle, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@GetMapping("/vehicles")
	public ResponseEntity<List<Vehicle>> getAllVehicles() {
			List<Vehicle> vehicles = vehicleDelegate.getAllVehicles();
			return new ResponseEntity<>(vehicles, HttpStatus.OK);
		}
	@GetMapping("/vehicles/{id}")
	public ResponseEntity<Vehicle> getVehicleById(@PathVariable("id") long id) {
		Vehicle vehicle = vehicleDelegate.getVehicleById(id);
		return new ResponseEntity<>(vehicle, HttpStatus.OK);
	}
	@DeleteMapping("/vehicles/{id}")
	public ResponseEntity<HttpStatus> deleteVehicle(@PathVariable("id") long id) {
    		vehicleDelegate.deleteVehicle(id);
			return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/vehicles")
	public ResponseEntity<HttpStatus> deleteAllVehicles() {
			vehicleDelegate.deleteAllVehicles();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
