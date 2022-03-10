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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.acsia.svp.delegate.CustomerDelegate;
import com.acsia.svp.model.Customer;

@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	CustomerDelegate customerDelegate;

	@PostMapping("/customers")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		customer = customerDelegate.createCustomer(customer);
		return new ResponseEntity<>(customer, HttpStatus.OK); 


	}
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllCustomers(@RequestParam(required = false) String name) {

		List<Customer> customers=customerDelegate.getAllCustomers(name);
		return new ResponseEntity<>(customers,HttpStatus.OK);

	}
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") long id) {
		Customer customer=customerDelegate.getCustomerById(id);
		return new ResponseEntity<>(customer,HttpStatus.OK);

	}
	@DeleteMapping("/customers/{id}")
	public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable("id") long id) {
		customerDelegate.deleteCustomer(id);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@DeleteMapping("/customers")
	public ResponseEntity<HttpStatus> deleteAllStudents() {
		customerDelegate.deleteAllCustomers();
		return new ResponseEntity<>(HttpStatus.OK);
		

	}
}