package com.cricket;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {
	private String name;
	private String country;
	private String role;
	@JsonProperty("price-in-crores")
    private String priceInCrores;
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public String getRole() {
		return role;
	}
	public String getPriceInCrores() {
		return priceInCrores;
	}
    
    
    
    
}
