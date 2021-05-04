package com.mobicule.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.mobicule.pojo.Company;
import com.mobicule.pojo.Department;
import com.mobicule.service.ICompanyService;
import com.mobicule.service.IDepartmentService;

public class DepartmentController extends MultiActionController {

	private IDepartmentService departmentService;
	private ICompanyService companyService;

	public IDepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(IDepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public ICompanyService getCompanyService() {
		return companyService;
	}

	public void setCompanyService(ICompanyService companyService) {
		this.companyService = companyService;
	}

	public ModelAndView addDepartment(HttpServletRequest request, HttpServletResponse response) {

		String dName = request.getParameter("dName");
		String dManager = request.getParameter("dManager");
		int cId = Integer.parseInt(request.getParameter("cId"));

		Department d = new Department();

		d.setdName(dName);
		d.setdManager(dManager);
		d.setcId(cId);

		departmentService.addDepartment(d);

		return showAllDepartments(request, response);
	}

	public ModelAndView showAddDepartmentForm(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("showAddDepartmentForm");
		List<Company> cdList = companyService.getAllCompanies();
		request.setAttribute("cdList", cdList);
		return new ModelAndView("AddDepartment");
	}

	public ModelAndView showAllDepartments(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("showAddDepartmentForm");
		List<Department> list = departmentService.getAllDepartments();
		request.setAttribute("dList", list);
		return new ModelAndView("ListAllDept");
	}

	public ModelAndView deleteDepartment(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("delete");
		 Integer dId = Integer.parseInt(request.getParameter("dId"));
		
		 System.out.println(dId);
		 departmentService.deleteDepartment(dId);
		return showAllDepartments(request, response);
	}

	public ModelAndView showUpdateForm(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("show update form");
		
		Integer dId = Integer.parseInt(request.getParameter("dId"));
		String dName = request.getParameter("dName");
		String dManager = request.getParameter("dManager");
		int cId = Integer.parseInt(request.getParameter("cId"));

		Department d = new Department();
		d.setdId(dId);
		d.setdName(dName);
		d.setdManager(dManager);
		d.setcId(cId);
		request.setAttribute("department", d);
		return new ModelAndView("UpdateDepartment");
	}

	public ModelAndView updateDepartment(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("update");
		
		Integer dId = Integer.parseInt(request.getParameter("dId"));
		String dName = request.getParameter("dName");
		String dManager = request.getParameter("dManager");
		int cId = Integer.parseInt(request.getParameter("cId"));

		Department d = new Department();
		d.setdId(dId);
		d.setdName(dName);
		d.setdManager(dManager);
		d.setcId(cId);

		departmentService.updateDepartment(d);

		return showAllDepartments(request, response);
	}

}
