package com.revature;

import org.springframework.web.client.RestTemplate;

import com.revature.models.Pokemon;

public class Driver {

	public static void main(String[] args) {
		
		String url = "https://pokeapi.co/api/v2/pokemon/15";

		RestTemplate rt = new RestTemplate();
		
		Pokemon a = rt.getForObject(url, Pokemon.class);
		
		System.out.println(a);
	}

}
