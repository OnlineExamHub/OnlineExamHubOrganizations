package com.OnlineExamHub.OnlineExamHubOrganizations.DAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.OnlineExamHub.OnlineExamHubOrganizations.DAO.OrganizationDao;
import com.OnlineExamHub.OnlineExamHubOrganizations.Model.OrganizationModel;


@Repository
public class OrganizationDaoImpl implements OrganizationDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<OrganizationModel> getOrganizationList() {
		String qry = " SELECT * FROM organizations ";
		try {
			List<OrganizationModel> organizationList =jdbcTemplate.query(qry, new RowMapper<OrganizationModel>(){
				@Override
				public OrganizationModel mapRow(ResultSet rs, int rowNum) throws SQLException {
					// TODO Auto-generated method stub
					OrganizationModel organizationModel = new OrganizationModel();
					
					organizationModel.setOrgId(rs.getLong("org_id"));
					organizationModel.setOrgName(rs.getString("org_name"));
					organizationModel.setOrgEmail(rs.getString("org_email"));
					organizationModel.setOrgContactno(rs.getString("org_contactno"));
					organizationModel.setOrgRegDate(rs.getDate("org_reg_date"));
					
					return organizationModel;
				}
			});
			
//			or we can also write rowmapper separately and use it here or else we can also use lambda function in here
//			just like this 
//			return jdbcTemplate.query(qry, (rs, rowNum) -> {});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<OrganizationModel>();
	}

}
