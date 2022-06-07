package com.soap.example.repository;



import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.soap.example.models.soap.emp.Country;

@Component
public class CountryRepository {
	private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		Country spain = new Country();
		spain.setName("Spain");
		spain.setCapital("Madrid");
		spain.setCurrency("EUR");
		spain.setPopulation(46704314);

		countries.put(spain.getName(), spain);

		Country poland = new Country();
		poland.setName("Poland");
		poland.setCapital("Warsaw");
		poland.setCurrency("PLN");
		poland.setPopulation(38186860);

		countries.put(poland.getName(), poland);

		Country uk = new Country();
		uk.setName("United Kingdom");
		uk.setCapital("London");
		uk.setCurrency("GBP");
		uk.setPopulation(63705000);

		countries.put(uk.getName(), uk);
	}

	public Country getCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return countries.get(name);
	}
}