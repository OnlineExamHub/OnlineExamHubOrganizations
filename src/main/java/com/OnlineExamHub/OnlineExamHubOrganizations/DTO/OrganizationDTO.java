package com.OnlineExamHub.OnlineExamHubOrganizations.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationDTO {
	private Long orgId;
	private String orgName;
	private String orgEmail;
	private String orgContactno;
	private Date orgRegDate;
}
