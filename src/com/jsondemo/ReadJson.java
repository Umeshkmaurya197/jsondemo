package com.jsondemo;

import java.io.BufferedReader;
import java.io.FileReader;
import com.google.gson.Gson;

public class ReadJson {
	
	public static void main (String[] args) {
		try {
			BufferedReader ds = new BufferedReader(new FileReader("D:/Code/Jsondemo/src/com/jsondemo/Country.json") );
			
			Gson gson= new Gson();
			
			 Country[] country = gson.fromJson(ds,Country[].class);
			 for(Country c : country) {
				 System.out.println(c.toString());
				 
				 System.out.print(c.getName()  +",");
				 System.out.print(c.getPopulation()+",");
				 System.out.print(c.getNameOfStates()+",\n\n");
			 }
		}
		catch (Exception e) {
			System.out.println(" : "+e);
		}
	}

}
