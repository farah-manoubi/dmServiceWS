package com.webservice.service;

import java.util.HashMap;
import java.util.Map;

import com.webservice.model.Country;

public class CountryImplement implements CountryInterface {
	
	private static Map<Integer, Country> countries = new HashMap<Integer, Country>();
	private int code = 0;
	
	public int addCountry(Country country) {
		if(country.getCode() == 0) {
			return -1;
		}
		++code;
		countries.put(code,  country);
		return code;
	}

	public Country getCountry(int code) {
		return countries.get(code);
	}

}
