package com.cts.training.companyservice;

import java.util.List;

import com.cts.training.model.Company;

public interface CompanyService 
{
	public Company insert(Company company);
	
	public void delete(int id);
	
	public Company updateCompany(Company company);
	
	public List<Company> getAllCompanies();
	
	public Company getCompanyById(int id);
	
	
}
