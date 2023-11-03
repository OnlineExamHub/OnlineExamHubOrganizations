package com.OnlineExamHub.OnlineExamHubOrganizations.ServicesImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.OnlineExamHub.OnlineExamHubOrganizations.DAO.OrganizationDao;
import com.OnlineExamHub.OnlineExamHubOrganizations.DTO.organizationDTO;
import com.OnlineExamHub.OnlineExamHubOrganizations.Model.organizationModel;
import com.OnlineExamHub.OnlineExamHubOrganizations.Services.OrganizationService;

import lombok.Builder;

@Service
public class OrganizationServiceImpl implements OrganizationService {
	
	private final OrganizationDao organizationDao;
	
	public OrganizationServiceImpl(OrganizationDao organizationDao) {
		this.organizationDao = organizationDao;
	}
	

	@Override
	public List<organizationDTO> getOrganizationList() {
		
		List<organizationModel> organizationList = organizationDao.findAll();
		
		System.out.println(organizationList);
		System.out.println("666666 " + organizationDao.count());
		
		return null;
	}

}
