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




public class CountryImplement implements CountryInterface {
	private HashMap<String, ArrayList<Politician>> politicians;

	public CountryImplement(){
		politicians= new HashMap<String, ArrayList<Politician>>();
	}
	
	
	
	public String addCountry(String country) {
		politicians.put(country, new ArrayList<Politician>());
		return country;
		
	}
	
	
	
	public int addPolitican(Politician politician) {
		boolean exist = false;
		ArrayList<Politician> al;
		if((al = politicians.get(politician.getLocation())) != null) {
			for(Politician pl : al) {
				if(pl.getName() == politician.getName()) {
					exist = true;
					break;
				}
					
			}
			
		}
		if(!exist) {
			al.add(politician);
		}
		else
			return -1;
		
		return 0;
		
	}
	//private ArrayList<Country> countries = new ArrayList<Country>();
	//private ArrayList<Politician> poli = new ArrayList<Politician>();
	
	/*public String addCountry(Country country) {
		if(country.getName() == null) {
			return -1;
		}
		countries.put(country);
		return country;
	}*/

	/*@WebMethod(operationName = "addCountry", action = "urn:AddCountry")
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
	}*/

	/*@WebMethod(operationName = "getCountry", action = "urn:GetCountry")
	@WebResult(name = "return")
	public Country getCountry(@WebParam(name = "arg0") String name) {
		
		for(int i = 0 ; i<countries.size(); i++) {
			if(countries.get(i).getName().equals(name)) {
				return countries.get(i);
			}
		}
		
		return null;
	}*/
		
}
