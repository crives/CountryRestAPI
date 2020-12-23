package com.cognixia.jump.application.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Country;

@Service
public class CountryService {


	private static List<Country> countryDatabase = new ArrayList<>();
		
	static {
		
		countryDatabase.add(new Country("France", "Paris", 12278210));
		countryDatabase.add(new Country("Costa Rica", "San José", 1033670));
		countryDatabase.add(new Country("Canada", "Ottawa", 994837));
		countryDatabase.add(new Country("Italy", "Rome", 4355725));
		countryDatabase.add(new Country("Spain", "Madrid", 6618000));
		
	}
	
	public List<Country> getAllCountries() {
		
		
		return countryDatabase;
		
	}
	
	public int getPopulation(String country) {
				
		int population = 0;

		for(int i = 0; i < countryDatabase.size(); i++) {
			
			if(countryDatabase.get(i).getCountry().equals(country)) {
				
				population = countryDatabase.get(i).getPopulation();
								
			}
		}
		
		return population;
		
	}
	
	public List<Country> getAllLessPopulations(String country) {
		
		Country currentCountry = null;
		List<Country> lessPopulations = new ArrayList<>();

		for(int i = 0; i < countryDatabase.size(); i++) {
			
			if(countryDatabase.get(i).getCountry().equals(country)) {
				
				currentCountry = countryDatabase.get(i);
			}
		}
		
		for(int i = 0; i < countryDatabase.size(); i++) {
			
			if(countryDatabase.get(i).getPopulation() < currentCountry.getPopulation()) {
				
				lessPopulations.add(countryDatabase.get(i));
				
			}
		}
		
		return lessPopulations;
	}
	
	
//	public List<Country> getAllCountriesLessValue(int value) {
//		
//		List<Country> countriesLessPopulation = new ArrayList<>();
//		
//		for(int i = 0; i < countryDatabase.size(); i++) {
//			
//			if(countryDatabase.get(i).getPopulation() < value) {
//				
//				countriesLessPopulation.add(countryDatabase.get(i));
//			}
//		}
//		return countriesLessPopulation;	
//	}
}