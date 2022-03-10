package com.acsia.svp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acsia.svp.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
	List<Vehicle> findByPlatenumberContaining(String platenumber);

}
