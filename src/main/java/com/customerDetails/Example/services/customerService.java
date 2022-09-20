package com.customerDetails.Example.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.customerDetails.Example.DAO.customerRepository;
import com.customerDetails.Example.exceptionHandling.CannotsaveException;
import com.customerDetails.Example.exceptionHandling.IdnotFoundException;
import com.customerDetails.Example.exceptionHandling.ValuesNotPresent;
import com.customerDetails.Example.models.customerDetails;
@Service
public class customerService {
	@Autowired customerRepository crepo;
	public  customerDetails getDetailsbyId(Integer id){
		if(crepo.findById(id).isPresent())
			return crepo.findById(id).get();
		else
			throw new IdnotFoundException("The"+id+" you are looking for is not present in our database");
	}
	public List<customerDetails> getAllDetails(){
		if(!crepo.findAll().isEmpty())
			return crepo.findAll();
		else
			throw new ValuesNotPresent("Sorry to inform you our database does not contain any values right now");
	}
	public void deleteById(Integer id) {
		if(crepo.findById(id).isPresent())
			crepo.deleteById(id);
		else
			throw new IdnotFoundException("The"+id+" you are trying to delete is not present in our database");
	}
	public Optional<customerDetails> updatingByid(customerDetails cD,Integer id){
		if(crepo.findById(id).isPresent()) {
			cD.setId(id);
			crepo.save(cD);
			return crepo.findById(id);
		}
		else
			throw new IdnotFoundException("The"+id+" you are trying to update is not present in our database");
		
	}
	public List<customerDetails> addingNew(customerDetails cD){
		if(!crepo.findById(cD.getId()).isPresent()) {
			crepo.save(cD);
		return crepo.findAll();
	}
		else 
			throw new CannotsaveException("The customer id which you are using is already present so you cannot use it");
	}
	
	
	
	

}
