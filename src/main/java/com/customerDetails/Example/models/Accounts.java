package com.customerDetails.Example.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity(name="Account_Details")
public class Accounts {
	@Id
	private Integer account_id;
	private  String type;
	@Temporal(TemporalType.DATE)
	private  Date opening_date;
	private  Double opening_blanace; 
	@ManyToOne
	@JoinColumn(name="custome_id")
	private customerDetails customerdetails;
	public Integer getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getOpening_date() {
		return opening_date;
	}
	public void setOpening_date(Date opening_date) {
		this.opening_date = opening_date;
	}
	public Double getOpening_blanace() {
		return opening_blanace;
	}
	public void setOpening_blanace(Double opening_blanace) {
		this.opening_blanace = opening_blanace;
	}
	@JsonBackReference
	public customerDetails getCustomerdetails() {
		return customerdetails;
	}
	public void setCustomerdetails(customerDetails customerdetails) {
		this.customerdetails = customerdetails;
	}
	
	
	
}
