package com.mobicule.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mobicule.dao.IDepartmentDAO;
import com.mobicule.pojo.Department;

public class DepartmentDAOImpl implements IDepartmentDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addDepartment(Department Department) {

		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int res = (Integer) session.save(Department);
		tx.commit();
		session.close();

		System.out.println(res);
		if (res != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Department> getAllDepartments() {

		Session session = this.sessionFactory.openSession();
		Query theQuery = session.createQuery("from Department");

		List<Department> list = theQuery.list();
		return list;
	}

	@Override
	public boolean updateDepartment(Department Department) {

		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(Department);
		tx.commit();
		session.close();

		return true;

	}

	@Override
	public boolean deleteDepartment(int cId) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Department comp = (Department) session.load(Department.class, cId);
		session.delete(comp);

		tx.commit();
		session.close();

		return true;

	}

	
}