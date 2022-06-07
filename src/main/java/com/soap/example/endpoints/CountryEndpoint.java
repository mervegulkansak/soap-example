package com.soap.example.endpoints;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.example.models.soap.emp.GetCountryRequest;
import com.soap.example.models.soap.emp.GetCountryResponse;
import com.soap.example.repository.CountryRepository;


@Endpoint
public class CountryEndpoint {
	private static final String NAMESPACE_URI = "http://soap.example.com/models/soap/emp";

	private CountryRepository countryRepository;

	@Autowired
	public CountryEndpoint(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
	@ResponsePayload
	public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
		GetCountryResponse response = new GetCountryResponse();
		response.setCountry(countryRepository.getCountry(request.getName()));

		return response;
	}
}

