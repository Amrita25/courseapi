package io.springbootstarter.hello;

import io.springbootstarter.web.model.BeerDto;
import io.springbootstarter.web.model.Customer;
import io.springbootstarter.web.services.CustomerService;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/customer")
@RestController
public class CustomerController {
	
	private CustomerService custService;
	
	@Autowired
	public CustomerController(CustomerService custService) {
		super();
		this.custService = custService;
	}

     @GetMapping({"/{customerID}"})
	public ResponseEntity<Customer> getCustomer(@PathVariable("customerID") UUID customerID){
		System.out.println("inside getCustomer");
		return new ResponseEntity<Customer>(custService.getCustomerById(customerID),HttpStatus.OK);
		
	}
     @PostMapping
 	public ResponseEntity<BeerDto> handlePost(@RequestBody Customer customer){
    	 Customer cust =custService.saveNewCustomer(customer);
 		HttpHeaders headers = new HttpHeaders();
 		headers.add("Location", cust.getId().toString());
 		System.out.println("inside handlePost Customer");
 		return new ResponseEntity<BeerDto>(headers, HttpStatus.CREATED);
 		
 	}
 	
 	@PutMapping({"/{custID}"})
 	public ResponseEntity<BeerDto> handleUpdate(@PathVariable("custID") UUID custID,@RequestBody Customer customer){
 		Customer cust =custService.updateCustomer(custID,customer);
 		System.out.println("inside handlePut Customer");
 		return new ResponseEntity<BeerDto>( HttpStatus.NO_CONTENT);
 		
 	}

}
