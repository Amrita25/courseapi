package io.springbootstarter.web.services;

import io.springbootstarter.web.model.BeerDto;
import io.springbootstarter.web.model.Customer;

import java.util.UUID;

public interface CustomerService {
	
	Customer getCustomerById(UUID custID);
	Customer saveNewCustomer(Customer customer);

	Customer updateCustomer(UUID custID,Customer customer);

}
