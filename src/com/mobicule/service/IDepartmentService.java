package com.mobicule.service;

import java.util.List;

import com.mobicule.pojo.Department;

public interface IDepartmentService {

	boolean addDepartment(Department department);

	List<Department> getAllDepartments();

	boolean updateDepartment(Department department);

	boolean deleteDepartment(int dId);

}
