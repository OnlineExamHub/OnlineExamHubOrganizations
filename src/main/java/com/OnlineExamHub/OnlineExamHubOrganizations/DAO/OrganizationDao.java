package com.OnlineExamHub.OnlineExamHubOrganizations.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineExamHub.OnlineExamHubOrganizations.Model.organizationModel;

public interface OrganizationDao extends JpaRepository<organizationModel, Long> {

//	List<organizationDTO> getOrganizationList();

}
