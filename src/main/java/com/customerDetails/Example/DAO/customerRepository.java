package com.customerDetails.Example.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerDetails.Example.models.customerDetails;

public interface customerRepository extends JpaRepository<customerDetails, Integer>{
}
