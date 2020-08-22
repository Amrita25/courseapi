package io.springbootstarter.web.services;

import io.springbootstarter.web.model.BeerDto;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class BeerServiceImpl implements BeerService{

	public BeerDto getBeerById(UUID beerID) {
		// TODO Auto-generated method stub
		return new BeerDto(UUID.randomUUID(),"CalsBerg","Strong",1L);
	}

	public BeerDto saveNewBeer(BeerDto beerDto) {
		// TODO Auto-generated method stub
		beerDto.setId(UUID.randomUUID());
		return beerDto;
	}

	public BeerDto updateBeer(UUID beerID,BeerDto beerDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
