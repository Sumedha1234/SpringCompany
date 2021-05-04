package com.mobicule.serviceimpl;

import java.util.List;


import com.mobicule.dao.ICompanyDAO;
import com.mobicule.pojo.Company;
import com.mobicule.service.ICompanyService;

public class CompanyServiceImpl implements ICompanyService {
	
	private ICompanyDAO companyDAO;
	
	public ICompanyDAO getCompanyDAO() {
		return companyDAO;
	}

	public void setCompanyDAO(ICompanyDAO companyDAO) {
		this.companyDAO = companyDAO;
	}

	@Override
	public boolean addCompany(Company company) {
		return companyDAO.addCompany(company);
	}

	@Override
	public List<Company> getAllCompanies() {
		return companyDAO.getAllCompanies();
	}

	@Override
	public boolean updateCompany(Company company) {
		return companyDAO.updateCompany(company);
	}

	@Override
	public boolean deleteCompany(int cId) {
		return companyDAO.deleteCompany(cId);
	}

}
