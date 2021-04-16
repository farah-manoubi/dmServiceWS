package com.webservice.model;

import java.util.ArrayList;
/**
 * Classe qui permet de créer l'objet Country. 
 * @file Country.java
 * @author MANOUBI Farah, DENDOUNE Rayane
 * @version 1.0
 * @date 16/04/2021
 *
 */
public class Country {
	private String name;

	/**
     * Constructeur de Country.
     * @param [in] name Nom du pays. (Type String)
     */
	public Country(String name) {
		this.name = name;
	}
	
	/**
	 * Fonction qui retourne le nom.
	 * String getName()
     * @return Retourne le nom du pays.
     */
	public String getName() {
		return name;
	}
	   
	/**
	 * Fonction qui modifie le nom.
	 * void setName()
     */
	public void setName(String name) {
		this.name = name;
	}
}
