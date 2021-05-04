package com.mobicule.controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.mobicule.pojo.Company;
import com.mobicule.service.ICompanyService;
import com.mobicule.serviceimpl.CompanyServiceImpl;

public class CompanyController extends MultiActionController {
	
	private ICompanyService companyService;

	public ICompanyService getCompanyService() {
		return companyService;
	}

	public void setCompanyService(ICompanyService companyService) {
		this.companyService = companyService;
	}

	public ModelAndView addCompany(HttpServletRequest request, HttpServletResponse response) {

		String name = request.getParameter("cName");
		String address = request.getParameter("cAddress");
		String email = request.getParameter("cEmail");

		Company c = new Company();

		c.setcName(name);
		c.setcAddress(address);
		c.setcEmail(email);

		companyService.addCompany(c);

		return showAllCompanies(request, response);
	}

	public ModelAndView showAddCompanyForm(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("showAddCompanyForm");

		return new ModelAndView("AddCompany");
	}

	public ModelAndView showAllCompanies(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("showAddCompanyForm");		
		List<Company> list = companyService.getAllCompanies();
		request.setAttribute("cList", list);
		return new ModelAndView("ListAll");
	}

	public ModelAndView deleteCompany(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("delete");
		Integer cId = Integer.parseInt(request.getParameter("cId"));

		System.out.println(cId);
		companyService.deleteCompany(cId);
		return showAllCompanies(request, response);
	}

	public ModelAndView showUpdateForm(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("show update form");
		Integer cId = Integer.parseInt(request.getParameter("cId"));

		System.out.println(cId);

		String name = request.getParameter("cName");
		String address = request.getParameter("cAddress");
		String email = request.getParameter("cEmail");

		Company c = new Company();
		c.setcId(cId);
		c.setcName(name);
		c.setcAddress(address);
		c.setcEmail(email);

		request.setAttribute("company", c);
		return new ModelAndView("UpdateCompany");
	}

	public ModelAndView updateCompany(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("update");
		Integer cId = Integer.parseInt(request.getParameter("cId"));

		System.out.println(cId);

		String name = request.getParameter("cName");
		String address = request.getParameter("cAddress");
		String email = request.getParameter("cEmail");

		Company c = new Company();
		c.setcId(cId);
		c.setcName(name);
		c.setcAddress(address);
		c.setcEmail(email);

		companyService.updateCompany(c);
		
		return showAllCompanies(request, response);
	}

}
