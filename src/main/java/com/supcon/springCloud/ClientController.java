package com.supcon.springCloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ClientController {

	@Value("${from}")
	private String from;
	
	@RequestMapping("/helloUsername")
	public String helloUsername(){
		return from;
	}
}
