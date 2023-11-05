package com.OnlineExamHub.OnlineExamHubOrganizations.ServicesImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.OnlineExamHub.OnlineExamHubOrganizations.DAO.OrganizationDao;
import com.OnlineExamHub.OnlineExamHubOrganizations.DTO.OrganizationDTO;
import com.OnlineExamHub.OnlineExamHubOrganizations.Model.OrganizationModel;
import com.OnlineExamHub.OnlineExamHubOrganizations.Services.OrganizationService;

import lombok.Builder;

@Service
public class OrganizationServiceImpl implements OrganizationService {
	
	private final OrganizationDao organizationDao;
	
	public OrganizationServiceImpl(OrganizationDao organizationDao) {
		this.organizationDao = organizationDao;
	}
	

	@Override
	public List<OrganizationDTO> getOrganizationList() {
		
		List<OrganizationModel> organizationList = organizationDao.getOrganizationList();
		
		System.out.println(organizationList);
		return null;
	}

}
