package io.springbootstarter.web.model;

import java.util.UUID;



public class BeerDto {
	private UUID  id ;
	private String beerName;
	private String berrStyle;
	private Long upc;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getBeerName() {
		return beerName;
	}
	public void setBeerName(String beerName) {
		this.beerName = beerName;
	}
	public String getBerrStyle() {
		return berrStyle;
	}
	public void setBerrStyle(String berrStyle) {
		this.berrStyle = berrStyle;
	}
	public Long getUpc() {
		return upc;
	}
	public void setUpc(Long upc) {
		this.upc = upc;
	}
	public BeerDto(UUID id, String beerName, String berrStyle, Long upc) {
		super();
		this.id = id;
		this.beerName = beerName;
		this.berrStyle = berrStyle;
		this.upc = upc;
	}
	
	public BeerDto(){
		
	}
	
	

}
