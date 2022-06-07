package com.soap.example.models.soap.emp;



public class Country {

	private String name;
	private int population;
	private String capital;
	private String currency;
	
	public Country() {}
	
	public Country(String name, int population, String capital, String currency) {
		super();
		this.name = name;
		this.population = population;
		this.capital = capital;
		this.currency = currency;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
}
