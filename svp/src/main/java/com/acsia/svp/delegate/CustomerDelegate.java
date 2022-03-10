package com.acsia.svp.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acsia.svp.model.Customer;
import com.acsia.svp.service.CustomerService;

@Component
public class CustomerDelegate {
	
	@Autowired
	CustomerService customerService;
	
	public Customer createCustomer(Customer customer){
		customer = customerService.createCustomer(customer);
		return customer;
		
}
	public List<Customer> getAllCustomers(String name){
		List<Customer> customers= customerService.getAllCustomers(name);
		return customers;
	}
	public Customer getCustomerById(long id) {
		Customer customer=customerService.getCustomerById(id);
		return customer;
	}
	public boolean deleteCustomer(long id) {
		boolean status=customerService.deleteCustomer(id);
		return status;
	}
	public boolean deleteAllCustomers() {
		boolean status=customerService.deleteAllCustomers();
		return status;
	}
}