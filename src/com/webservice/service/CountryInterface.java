package com.webservice.service;

import javax.jws.*;
import com.webservice.model.Country;

@WebService(name="CountryInterface", targetNamespace ="http://service.webservice.com/")
public interface CountryInterface {
	
	@WebMethod(operationName="addCountry", action="urn:AddCountry")
	@WebResult(name="code")
	public int addCountry(@WebParam(name="country")Country country);
	
	@WebMethod(operationName="getCountry", action="urn:GetCountry")
	@WebResult(name="code")
	public Country getCountry(@WebParam(name="code")int code);
}
