package io.springbootstarter.web.services;

import io.springbootstarter.web.model.BeerDto;
import io.springbootstarter.web.model.Customer;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

	public Customer getCustomerById(UUID custID) {
		// TODO Auto-generated method stub
		return new Customer(UUID.randomUUID(),"ABC");
	}

	public Customer saveNewCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customer.setId(UUID.randomUUID());
		return customer;
	}

	public Customer updateCustomer(UUID custID, Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
