package com.cts.training.controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.cts.training.model.Company;
public class CompanyController {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
	    Company company = new Company(101, "CTS", "Digital Transformation", "Brian Hamphrac", 567576576.676);
		session.save(company);
		Company getCompany=session.get(Company.class, 103);
		//getUser.setEnabled(true);
		//getUser.setPassword("9999");
		//session.update(getCompany);
		//session.delete(getCompany);
		transaction.commit();
		session.close();
	}

}
