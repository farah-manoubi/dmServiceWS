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

import antlr.collections.List;


/**
 * Classe qui contient les méthodes permettant de réaliser les traitements des données, comme l'ajout de pays, de politiciens...
 * @file CountryImplement.java
 * @author MANOUBI Farah, DENDOUNE Rayane
 * @version 1.0
 * @date 16/04/2021
 *
 */
@WebService(targetNamespace = "http://service.webservice.com/", portName = "CountryImplementPort", serviceName = "CountryImplementService")
public class CountryImplement implements CountryInterface {
	private HashMap<String, ArrayList<Politician>> politicians;

	/**
     * Constructeur de CountryImplement.
     */
	public CountryImplement(){
		politicians= new HashMap<String, ArrayList<Politician>>();
	}
	
	
	/**
	 * Fonction qui permet d'ajouter un pays.
	 * String addCountry(String country)
     * @param [in] country Nom du pays. (Type String)
     * @return Retourne le nom du pays qui à été ajouté.
     */
	@WebMethod(operationName = "addCountry", action = "urn:AddCountry")
	@WebResult(name = "return")
	public String addCountry(@WebParam(name = "arg0") String country) {
		politicians.put(country, new ArrayList<Politician>());
		return country;
		
	}
	
	
	/**
	 * Fonction qui permet d'ajouter un politicien.
	 * String addPolitician(String name, int age, int popularity, String location)
     * @param [in] name Nom du politicien. (Type String)
     * @param [in] age Age du politicien. (Type int)
     * @param [in] popularity NOmbre d'abonnés. (Type int)
     * @param [in] location Nom du pays. (Type String)
     * @return Retourne 0 si le politicien à bien été ajouté, -1 en cas d'erreur.
     */
	@WebMethod(operationName = "addPolitican", action = "urn:AddPolitican")
	@WebResult(name = "return")
	public int addPolitician(@WebParam(name = "arg0") String name, @WebParam(name = "arg1") int age, @WebParam(name = "arg2") int popularity, @WebParam(name = "arg3") String location) {		
		boolean exist = false;
		ArrayList<Politician> al;
		if((al = politicians.get(location)) != null) {
			for(Politician pl : al) {
				if(pl.getName() == name) {
					exist = true;
					break;
				}
					
			}
			
		}
		if(!exist) {
			al.add(new Politician(name, age, popularity, location));
		}
		else
			return -1;
		
		return 0;
		
	}
	
	/**
	 * Fonction qui permet d'obtenir le nom des N politiciens d'un pays en fonction du pays passé en paramètre.
	 * String getPoliticianByCountry(String country)
     * @param [in] country Nom du pays. (Type String)
     * @return Retourne un String contenant les noms des politiciens du pays choisi.
     */
	@WebMethod(operationName = "getPoliticianByCountry", action = "urn:GetPoliticianByCountry")
	@WebResult(name = "return")
	public String getPoliticianByCountry(@WebParam(name = "arg0") String country) {
		String polis = "";
		for (HashMap.Entry<String, ArrayList<Politician>> entry : politicians.entrySet()){
				if(entry.getKey().equals(country)) {
					for (int i = 0; i< entry.getValue().size(); i++) {
						polis += entry.getValue().get(i).getName() + "\n";
					}	
				}
		}
		return polis;
	}

}
