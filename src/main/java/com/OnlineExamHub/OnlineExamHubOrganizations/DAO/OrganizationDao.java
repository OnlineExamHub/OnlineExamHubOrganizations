package com.OnlineExamHub.OnlineExamHubOrganizations.DAO;

import java.util.List;

import com.OnlineExamHub.OnlineExamHubOrganizations.DTO.OrganizationDTO;
import com.OnlineExamHub.OnlineExamHubOrganizations.Model.OrganizationModel;

public interface OrganizationDao {

	List<OrganizationModel> getOrganizationList();

}
