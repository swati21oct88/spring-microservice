package com.boot.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.demo.model.BeerDto;
import com.boot.demo.service.BeerService;

@RestController
@RequestMapping("/api")
public class BeerController {
	
	private BeerService beerService;
	
	@Autowired
	public BeerController(BeerService beerService) {
		this.beerService = beerService;
	}
	
	@RequestMapping(value = "/beers",method = RequestMethod.GET)
	public BeerDto getBeers() {
        return beerService.getBeer();
	}

}
