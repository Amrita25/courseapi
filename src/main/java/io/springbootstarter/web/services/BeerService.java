package io.springbootstarter.web.services;

import io.springbootstarter.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
	
BeerDto getBeerById(UUID beerID);
	
BeerDto saveNewBeer(BeerDto beerDto);

BeerDto updateBeer(UUID beerID,BeerDto beerDto);

}
