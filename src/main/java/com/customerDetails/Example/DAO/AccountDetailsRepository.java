package com.customerDetails.Example.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerDetails.Example.models.Accounts;

public interface AccountDetailsRepository extends JpaRepository<Accounts, Integer> {
	List<Accounts>findAllByType(String type);

}
