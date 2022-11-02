package com.cricket;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Assert;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.json.JsonMapper;


public class CricketTeam {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file = new File("C:\\Users\\Arunsrj\\eclipse-workspace\\AllProgrammes\\src\\test\\resources\\team.json");
		
		JsonMapper jm = new JsonMapper();
		
		PojoCricketTeam readValue = jm.readValue(file, PojoCricketTeam.class);
		
		ArrayList<Player> player = readValue.getPlayer();
		
		int countcountry = 0;
		int countwicketkeeper=0;
		
		for (Player player2 : player) {
			
			String country = player2.getCountry();
			if (!country.equalsIgnoreCase("India")) {
				countcountry++;
			}
			
			String role = player2.getRole();
			if (role.equalsIgnoreCase("Wicket-keeper")) {
				countwicketkeeper++;
			}
		}
		Assert.assertEquals(4, countcountry);
		System.out.println("Foreign Players count:"+countcountry);
		
		Assert.assertEquals(1, countwicketkeeper);
		System.out.println("wicketkeeper count:"+countwicketkeeper);

	}
}
