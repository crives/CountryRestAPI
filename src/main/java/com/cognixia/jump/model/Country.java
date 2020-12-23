package com.cognixia.jump.model;

public class Country {
	
	private String country;
	
	private int population;
	
	private String capital;

	
	public Country(String country, String capital, int population) {
		super();
		this.country = country;
		this.capital = capital;
		this.population = population;
	
	}

	public String getCountry() {
		
		return country;
	}
	
	public void setCountry(String country) {
		
		this.country = country;
	}
	
	public int getPopulation() {
		
		return population;
	}
	
	public void setPopulation(int population) {
		
		this.population = population;
	}
	
	public String getCapital() {
		
		return capital;
	}
	
	public void setCapital(String capital) {
		
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Country [country=" + country + ", population=" + population + ", capital=" + capital + "]";
	}	
}
