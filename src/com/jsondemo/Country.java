package com.jsondemo;

import java.util.List;

class Country {
	String name;
	int population;
	List<String> nameOfStates;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public List<String> getNameOfStates() {
		return nameOfStates;
	}
	public void setNameOfStates(List<String> nameOfStates) {
		this.nameOfStates = nameOfStates;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + ", nameOfStates=" + nameOfStates + "]";
	}
	
	
	
}
