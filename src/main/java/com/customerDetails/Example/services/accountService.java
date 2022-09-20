package com.customerDetails.Example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerDetails.Example.DAO.AccountDetailsRepository;
import com.customerDetails.Example.exceptionHandling.IdnotFoundException;
import com.customerDetails.Example.models.Accounts;
import com.customerDetails.Example.models.customerDetails;

@Service
public class accountService {
	@Autowired AccountDetailsRepository arepo;
public List<String> filterCustomers(String type){
	if(!arepo.findAllByType(type).isEmpty()) {
	List<Accounts> list= arepo.findAllByType(type);
	List<String> list1= new ArrayList<>();
	for(Accounts i:list) {
		list1.add(i.getCustomerdetails().getName());
	}
	return list1;
}
	else 
		throw new IdnotFoundException("Customer with savings of type "+type+" are not there in our database");
}
public Accounts get(Integer id)
{
	return arepo.findById(id).get(); 
	}
}
