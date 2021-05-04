package com.mobicule.dao;

import java.util.List;

import com.mobicule.pojo.Company;

public interface ICompanyDAO {

	boolean addCompany(Company company);

	List<Company> getAllCompanies();

	boolean updateCompany(Company company);

	boolean deleteCompany(int cId);

}
