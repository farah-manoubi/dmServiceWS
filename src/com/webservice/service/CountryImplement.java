package com.webservice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.webservice.model.Country;
import com.webservice.model.Politician;

@WebService(targetNamespace = "http://service.webservice.com/", portName = "CountryImplementPort", serviceName = "CountryImplementService")
public class CountryImplement implements CountryInterface {
	
	private static Map<Politician, Country> politicians = new HashMap<Politician, Country>();
	private ArrayList<Country> countries = new ArrayList<Country>();
	
	/*public String addCountry(Country country) {
		if(country.getName() == null) {
			return -1;
		}
		countries.put(country);
		return country;
	}*/

	@WebMethod(operationName = "addCountry", action = "urn:AddCountry")
	@WebResult(name = "return")
	public String addCountry(@WebParam(name = "arg0") String country) {
		boolean exist = false;
		for(int i = 0; i<countries.size(); i++) {
			if(countries.get(i).getName().equals(country)) {
				exist = true;
			}
		}
		if(!exist) {
			countries.add(new Country(country));
		}
		return country;
	}

	@WebMethod(operationName = "getCountry", action = "urn:GetCountry")
	@WebResult(name = "return")
	public Country getCountry(@WebParam(name = "arg0") String name) {
		
		for(int i = 0 ; i<countries.size(); i++) {
			if(countries.get(i).getName().equals(name)) {
				return countries.get(i);
			}
		}
		
		return null;
	}

	@WebMethod(operationName = "getAllPoliticians", action = "urn:GetAllPoliticians")
	@WebResult(name = "return")
	public ArrayList<Politician> getAllPoliticians(@WebParam(name = "arg0") Country country) {
		/*boolean exist = false;
		Country country = new Country("name");
		for (int i = 0; i < politicians.size(); i++) {
			if(politicians.get(i).getName().equals(politician)) {
				exist = true;
			}
			
		}
		if(!exist) {
			politicians.put(country,politician);
		}
		return politicians;*/
		
		ArrayList<Politician> politic = new ArrayList<Politician>();
		
		for (Entry<Politician, Country> entry : politicians.entrySet()) {
			 if(entry.getValue().equals(country.getName())) {
				 politic.add(entry.getKey());
			 }
			 
			 
		 }
		 return politic;
	}

	
}
