package com.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExRestController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/execute")
	public String execute() {
		return this.restTemplate.getForObject("http://MYOTHERCLIENT/serviceinfo", String.class);
	}
}
