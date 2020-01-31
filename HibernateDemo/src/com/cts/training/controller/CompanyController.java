package com.cts.training.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.Company;
import com.cts.training.model.User;

public class CompanyController {

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		//Company company=new Company(102,"TCS","Digital","Hamphrac",8176635.222);
		//session.save(company);
		Company getCompany=session.get(Company.class, 102);
				//getCompany.setEnabled(true);
				//getCompany.setname("CTS");
				//session.update(getCompany);
				//session.delete(getUser);
				List<Company> users =session.createQuery("From Company").list();
			users.forEach(System.out::println);
		transaction.commit();
		session.close();
    }
}
