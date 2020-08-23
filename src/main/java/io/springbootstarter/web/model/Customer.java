package io.springbootstarter.web.model;

import java.util.UUID;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Customer {
	private UUID id ;
	
	@NotBlank
	@Size(min=3,max=10)
	private String name;
	
	public Customer() {
	}
	public Customer(UUID id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
