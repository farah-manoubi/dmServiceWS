package com.webservice.model;

/**
 * @file Politician.java
 * @brief Classe qui permet de cr�er l'objet Politician. 
 * @author MANOUBI Farah, DENDOUNE Rayane
 * @version 1.0
 * @date 16/04/2021
 *
 */
public class Politician {
	private String name;
	private int age;
	private int popularity;
	private String location;
	
	/**
     * Constructeur de Country
     * @param [in] name Nom du politicien. (Type String)
     * @param [in] age Age du politicien. (Type int)
     * @param [in] popularity NOmbre d'abonn�s. (Type int)
     * @param [in] location Nom du pays. (Type String)
     */
	public Politician(String name, int age, int popularity, String location) {
		this.name = name;
		this.age = age;
		this.popularity = popularity;
		this.location = location;
	}
	//
	
	/**
	 * Fonction qui retourne le nom du politicien.
	 * String getName()
     * @return Retourne le nom du politicien.
     */
	public String getName() {
		return name;
	}
	
	/**
	 * Fonction qui modifie le nom du politicien.
	 * void setName()
     * @param [in] name Nom du politicien. (Type String)
     */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Fonction qui retourne l'�ge du politicien.
	 * String getAge()
     * @return Retourne l'�ge du politicien.
     */
	public int getAge() {
		return age;
	}
	
	/**
	 * Fonction qui modifie l'�ge du politicien.
	 * String setPopularity()
     * @param [in] age �ge du politicien. (Type int)
     */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Fonction qui retourne le nombre d'abonn� du politicien.
	 * String getPopularity()
     * @return Retourne le nombre d'abonn�s du politicien.
     */
	public int getPopularity() {
		return popularity;
	}
	
	/**
	 * Fonction qui modifie le nombre d'abonn�s du politicien.
	 * String setPopularity()
     * @param [in] popularity nombre d'abonn�s du politicien. (Type int)
     */
	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}
	
	/**
	 * Fonction qui retourne le pays du politicien.
	 * String getLocation()
     * @return Retourne le pays du politicien.
     */
	public String getLocation() {
		return location;
	}
	   
	/**
	 * Fonction qui modifie le pays du politicien.
	 * String setLocation()
     * @param [in] location Le pays du politicien. (Type String)
     */
	public void setLocation(String location) {
		this.location = location;
	}
}
