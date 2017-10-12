package com.yourcodelab.service;

import java.util.ArrayList;
import java.util.List;

import com.yourcodelab.model.Customer;

public class CustomerService {
	private CustomerDAO dao;
	
	public CustomerService(){
		dao = new CustomerDAO();
		
		
		//return list;
	}
	
	public void insertCustomer(int id, String name, String email){
		//Chamar a DAO
	}
	
	public List<Customer> listAll(){
		return dao.listAll();
	}
}
