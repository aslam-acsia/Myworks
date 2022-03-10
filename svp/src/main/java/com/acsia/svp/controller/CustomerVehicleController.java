package com.acsia.svp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acsia.svp.delegate.CustomerVehicleDelegate;
import com.acsia.svp.model.CustomerVehicle;
import com.acsia.svp.vo.CustomerVehicleVO;

@RestController
@RequestMapping("/api")
public class CustomerVehicleController {
	@Autowired
	CustomerVehicleDelegate customerVehicleDelegate;
	@PostMapping("/customervehicle")
	public ResponseEntity<CustomerVehicle> create(@RequestBody CustomerVehicleVO cv) {
		CustomerVehicle cv1=customerVehicleDelegate.create(cv);
		return new ResponseEntity<>(cv1,HttpStatus.OK);
	}
		
	@GetMapping("/customervehicle")
	public ResponseEntity<List<CustomerVehicle>> getAll() {
		List<CustomerVehicle> cv=customerVehicleDelegate.getAll();
		return new ResponseEntity<>(cv,HttpStatus.OK);
	}
	@DeleteMapping("/customervehicle")
	public ResponseEntity<HttpStatus> deleteAll(){
		customerVehicleDelegate.deleteAll();
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
	
	
	

}
