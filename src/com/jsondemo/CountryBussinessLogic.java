package com.jsondemo;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class CountryBussinessLogic {

	public static void main (String [] args ) {
		Country country = new Country();
		List<Country> countries =new ArrayList<Country>();
		
		country.setName("india");
		country.setPopulation(1220546300);
		List<String> listOfState = new ArrayList<String>();
		listOfState.add("up");
		listOfState.add("Goa");
		listOfState.add("delhi");
		listOfState.add("jammu");
		
		Country country1 = new Country();
		country1.setName("America");
		country1.setPopulation(56223);
		List<String> listOfState1 = new ArrayList<String>();
		listOfState1.add("Los Angeles ");
		listOfState1.add("New York ");
		listOfState1.add("Sanfrancisco");
		listOfState1.add("Canada");
	
		
		country.setNameOfStates(listOfState);
		country1.setNameOfStates(listOfState1);
		
		countries.add(country);
		countries.add(country1);
		
		Gson gson= new Gson();
		
		String json = gson.toJson(countries);
		try {		
			FileWriter writer = new FileWriter("D:/Code/Jsondemo/src/com/jsondemo/Country.json"); 
			writer.write(json);
			writer.close();
		}
		catch(Exception e)
		{
			System.out.println(" : "+e);
		}		
	}
}
