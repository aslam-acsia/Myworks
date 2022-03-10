package com.acsia.svp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.acsia.svp.model.Customer;
import com.acsia.svp.repository.CustomerRepository;
@Component
public class CustomerService {
	@Autowired
	CustomerRepository customerrepository;
	public Customer createCustomer(Customer customer) {
		try {
			customer=customerrepository.saveAndFlush(customer);


		} catch (Exception e) {
			e.printStackTrace();

		}
		return customer;
	}
	public List<Customer> getAllCustomers(String name) {
		try {
			List<Customer> customers = new ArrayList<Customer>();
			if (name == null) {
				customerrepository.findAll().forEach(customers::add);}
			else {
				customerrepository.findByNameContaining(name).forEach(customers::add);}

			return customers;
		} catch (Exception e) {
			return null;

		}

	}
	public Customer getCustomerById(long id) {
		Optional<Customer> customer = customerrepository.findById(id);
		if (customer.isPresent()) {
			return customer.get();
		} else {
			return null;
		}
	}
	public boolean deleteCustomer(long id) {
		try {
			customerrepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean deleteAllCustomers() {
		try {
			customerrepository.deleteAll();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
