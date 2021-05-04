package com.mobicule.dao;

import java.util.List;

import com.mobicule.pojo.Department;

public interface IDepartmentDAO {
	boolean addDepartment(Department department);

	List<Department> getAllDepartments();

	boolean updateDepartment(Department department);

	boolean deleteDepartment(int dId);

}
