package com.zensar.discovery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Applications;
/**
 * Its for getting all the services 
 * @author Mahi
 *
 */
@RestController
public class DiscoveryController {

	@Autowired
	private EurekaClient eurekaClient;
	
	@GetMapping("/applications")
	public Applications getApplications(){
		return eurekaClient.getApplications();
	}
}
