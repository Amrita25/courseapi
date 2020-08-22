package io.springbootstarter.hello;

import io.springbootstarter.web.model.BeerDto;
import io.springbootstarter.web.services.BeerService;
import io.springbootstarter.web.services.BeerServiceImpl;

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

@RestController
@RequestMapping("api/v1/beer/")
public class BeerController {
	
	
	private static final BeerService beerService=new BeerServiceImpl();

	@RequestMapping("/hi")
	public String sayHi(){
		return "Hi";
	}
	@RequestMapping("/hello")
	public String sayHello(){
		return "Hello";
	}
	
	@GetMapping({"/{brID}"})
	public ResponseEntity<BeerDto> getBeer(@PathVariable("brID") UUID beerID){
		System.out.println("inside");
		return new ResponseEntity<BeerDto>(beerService.getBeerById(beerID),HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<BeerDto> handlePost(@RequestBody BeerDto beerDto){
		BeerDto brDto =beerService.saveNewBeer(beerDto);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location", brDto.getId().toString());
		
		return new ResponseEntity<>(headers, HttpStatus.CREATED);
		
	}
	
	@PutMapping({"/{beerID}"})
	public ResponseEntity<BeerDto> handleUpdate(@PathVariable("beerID") UUID beerID,@RequestBody BeerDto beerDto){
		BeerDto brDto =beerService.updateBeer(beerID,beerDto);
		System.out.println("inside update service");
		return new ResponseEntity<>( HttpStatus.NO_CONTENT);
		
	}
	
}
