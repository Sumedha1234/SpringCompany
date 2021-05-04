package com.mobicule.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mobicule.dao.ICompanyDAO;
import com.mobicule.pojo.Company;

public class CompanyDAOImpl implements ICompanyDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addCompany(Company company) {

		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int res = (Integer) session.save(company);
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
	public List<Company> getAllCompanies() {

		Session session = this.sessionFactory.openSession();
		Query theQuery = session.createQuery("from Company");

		List<Company> list = theQuery.list();
		return list;
	}

	@Override
	public boolean updateCompany(Company company) {

		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(company);
		tx.commit();
		session.close();

		return true;

	}

	@Override
	public boolean deleteCompany(int cId) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Company comp = (Company) session.load(Company.class, cId);
		session.delete(comp);

		tx.commit();
		session.close();

		return true;

	}

}