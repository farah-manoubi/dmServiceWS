package com.webservice.service;

import java.util.ArrayList;
import java.util.Map;

import javax.jws.*;
import com.webservice.model.Country;
import com.webservice.model.Politician;

@WebService(name="CountryInterface", targetNamespace ="http://service.webservice.com/")
public interface CountryInterface {
	
	@WebMethod(operationName="addCountry", action="urn:AddCountry")
	@WebResult(name="country")
	public String addCountry(@WebParam(name="country")String country);
	
	@WebMethod(operationName="getCountry", action="urn:GetCountry")
	@WebResult(name="country")
	public Country getCountry(@WebParam(name="country")String name);
	
	@WebMethod(operationName="getAllPoliticians", action="urn:GetAllPoliticians")
	@WebResult(name="politician")
	public ArrayList<Politician> getAllPoliticians(Country country);
}
