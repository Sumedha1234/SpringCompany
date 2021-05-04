package com.mobicule.serviceimpl;

import java.util.List;


import com.mobicule.dao.IDepartmentDAO;
import com.mobicule.pojo.Department;
import com.mobicule.service.IDepartmentService;

public class DepartmentServiceImpl implements IDepartmentService {
	
	private IDepartmentDAO DepartmentDAO;
	
	public IDepartmentDAO getDepartmentDAO() {
		return DepartmentDAO;
	}

	public void setDepartmentDAO(IDepartmentDAO DepartmentDAO) {
		this.DepartmentDAO = DepartmentDAO;
	}

	@Override
	public boolean addDepartment(Department Department) {
		return DepartmentDAO.addDepartment(Department);
	}

	@Override
	public List<Department> getAllDepartments() {
		return DepartmentDAO.getAllDepartments();
	}

	@Override
	public boolean updateDepartment(Department Department) {
		return DepartmentDAO.updateDepartment(Department);
	}

	@Override
	public boolean deleteDepartment(int cId) {
		return DepartmentDAO.deleteDepartment(cId);
	}

}
