package com.OnlineExamHub.OnlineExamHubOrganizations.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organization")
public class OrganizationController {
	
	@GetMapping
	public String organization() {
		System.out.println("in orginization get method");
		
		return "in orginization get method";
	}
}
