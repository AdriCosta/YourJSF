package com.yourcodelab.DAO;

import java.util.ArrayList;
import java.util.List;

import br.edu.unicesumar.model.Customer;

public class CustomerDAO {
	public void insert(Customer c){
		
	}
	
	public List<Customer> listAll(){
		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(new Customer(1, "Alex", "alex@gmail.com"));
		list.add(new Customer(2, "John", "john@gmail.com"));
		list.add(new Customer(3, "Scott", "scott@gmail.com"));
		
		return list;
	}	
	
}