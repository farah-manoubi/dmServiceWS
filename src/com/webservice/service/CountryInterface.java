package com.webservice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.jws.*;
import com.webservice.model.Country;
import com.webservice.model.Politician;

/**
 * Interface qui appelle les méthodes de la classe CountryImplement.
 * @file CountryInterface.java
 * @author MANOUBI Farah, DENDOUNE Rayane
 * @version 1.0
 * @date 16/04/2021
 *  
 */
@WebService(name="CountryInterface", targetNamespace ="http://service.webservice.com/")
public interface CountryInterface {
	
	@WebMethod(operationName="addCountry", action="urn:AddCountry")
	@WebResult(name="country")
	public String addCountry(@WebParam(name="country")String country);
	
	@WebMethod(operationName="addPolitician", action="urn:AddPolitician")
	@WebResult(name="politician")
	public int addPolitician(String name, int age, int popularity, String location);

	@WebMethod(operationName="getPoliticianByCountry", action="urn:GetPoliticianByCountry")
	@WebResult(name="politician")
	public String getPoliticianByCountry(String country);
}
//