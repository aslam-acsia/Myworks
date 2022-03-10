package com.acsia.svp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acsia.svp.model.CustomerVehicle;

public interface CustomerVehicleRepository extends JpaRepository<CustomerVehicle, Long> {

}
