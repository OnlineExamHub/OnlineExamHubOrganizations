package com.OnlineExamHub.OnlineExamHubOrganizations.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "organizations")
public class organizationModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "org_id")
	private Long orgId;
	
	@Column(name = "org_name")
	private String orgName;
	
	@Column(name = "org_email")
	private String orgEmail;
	
	@Column(name = "org_contactno",  length = 20)
	private String orgContactno;
	
	@Column (name = "org_reg_date")
	private Date orgRegDate;

}
