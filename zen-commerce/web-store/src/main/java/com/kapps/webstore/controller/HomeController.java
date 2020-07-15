package com.kapps.webstore.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {

	private static final String ALL_CATEGORIES_URL = "http://localhost:8080/api/category/all";
	private static final String ALL_PRODUCTS_URL = "http://localhost:8080/api/product/all";
	private static final String ALL_SKUS_URL = "http://localhost:8080/api/product/all";
	
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/home")
	public String getHomePage(ModelMap model) {
		System.out.println("###############################");
		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
		// Request to return JSON format
		//headers.setContentType(MediaType.APPLICATION_JSON);
		//headers.set("my_other_key", "my_other_value");

		// HttpEntity<String>: To get result as String.
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		// Send request with GET method and default Headers.
		ResponseEntity<List> result = restTemplate.exchange(ALL_CATEGORIES_URL, HttpMethod.GET, entity, List.class);
		model.put("allCategories", result.getBody());
		System.out.println("######################################---------"+result.getBody());
		return "home";
	}
}
