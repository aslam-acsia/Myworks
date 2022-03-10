package com.acsia.svp.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.acsia.svp.model.Customer;

public interface CustomerRepository extends JpaRepository <Customer, Long> {
	List<Customer> findByNameContaining(String name);

}
