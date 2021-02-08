package io.springbootstarter.exception;

import java.util.UUID;

public class BeerNotFoundException extends RuntimeException {
	private UUID beerID;
	public BeerNotFoundException(UUID beerID){
		this.beerID=beerID;
	}
	public UUID getBeerID() {
		return beerID;
	}
	
}
