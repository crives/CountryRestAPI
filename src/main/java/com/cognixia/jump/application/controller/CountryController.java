package com.cognixia.jump.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.application.service.CountryService;
import com.cognixia.jump.model.Country;

@RequestMapping("/api")
@RestController
public class CountryController {
	
	@Autowired
	CountryService service;
	
	@GetMapping("/countries")
	public List<Country> getAllCountries() {
		
		return service.getAllCountries();
	}

	@GetMapping("/population/{country}")
	public int getPopulation(@PathVariable String country) {
		
		return service.getPopulation(country);
	}
	
	
	@GetMapping("/population/less/{country}")
	public List<Country> getAllLessPopulations(@PathVariable String country) {
		
		return service.getAllLessPopulations(country);	
	}
	
	
//	@RequestMapping(value = "/population/less/{value}", method = RequestMethod.GET)
//	public List<Country> getAllCountriesLessValue(@PathVariable int value) {
//		
//		return service.getAllCountriesLessValue(value);
//	}
}
