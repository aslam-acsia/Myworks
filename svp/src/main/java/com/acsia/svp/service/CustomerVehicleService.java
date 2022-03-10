package com.acsia.svp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.acsia.svp.model.Customer;
import com.acsia.svp.model.CustomerVehicle;
import com.acsia.svp.model.Vehicle;
import com.acsia.svp.repository.CustomerRepository;
import com.acsia.svp.repository.CustomerVehicleRepository;
import com.acsia.svp.repository.VehicleRepository;
import com.acsia.svp.vo.CustomerVehicleVO;
@Component
public class CustomerVehicleService {
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	VehicleRepository vehicleRepository;
	@Autowired
	CustomerVehicleRepository customerVehicleRepository;


	public CustomerVehicle create(CustomerVehicleVO cv) {
		try {
			Optional<Customer> customer = customerRepository.findById(cv.getCustomerId());
			Optional<Vehicle> vehicle = vehicleRepository.findById(cv.getVehicleId());
			CustomerVehicle model=new CustomerVehicle();
			if(customer.isPresent()&&vehicle.isPresent()) {

				model.setCustomerId(customer.get());
				model.setVehicleId(vehicle.get());
				model=customerVehicleRepository.saveAndFlush(model);
				return model;

			}
			else {
				return null;
			}


		} catch (Exception e) {
			return null;
		}
	}
	public List<CustomerVehicle> getAll() {
		try {
			List<CustomerVehicle> cv=new ArrayList<CustomerVehicle>();
			customerVehicleRepository.findAll().forEach(cv::add);
			return cv;
			}


		 catch (Exception e) {
			return null;
		}
	}
	public void deleteAll() {
		try {
			customerVehicleRepository.deleteAll();
		}
		catch(Exception e) {}
		
	}
	

}
