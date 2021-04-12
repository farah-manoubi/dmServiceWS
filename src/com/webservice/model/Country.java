package com.webservice.model;

import java.util.ArrayList;

public class Country {
	private String name;
	ArrayList<Politician> politician = new ArrayList<Politician>();

	public Country(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Politician> getPolitician() {
		return politician;
	}
	public void setPolitician(ArrayList<Politician> politician) {
		this.politician = politician;
	}
}
