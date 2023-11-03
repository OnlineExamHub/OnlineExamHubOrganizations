package com.OnlineExamHub.OnlineExamHubOrganizations.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineExamHub.OnlineExamHubOrganizations.DTO.organizationDTO;
import com.OnlineExamHub.OnlineExamHubOrganizations.Services.OrganizationService;

@RestController
@RequestMapping("/organization")
public class OrganizationController {
	
	@Autowired
	OrganizationService organizationService;
	
	@GetMapping
	public List<organizationDTO> organization() {
		System.out.println("in orginization get method");
		
		List<organizationDTO> allOrganizationList = organizationService.getOrganizationList();
		
		return null;
	}
}
