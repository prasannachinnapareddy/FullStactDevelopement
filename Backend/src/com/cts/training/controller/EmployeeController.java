package com.cts.training.controller;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.ContractualEmployee;
import com.cts.training.model.Employee;
import com.cts.training.model.PermanentEmployee;
public class EmployeeController {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee employee=new Employee();
		employee.setName("prasanna");
		/*Map<String,String> emails=new LinkedHashMap<>();
		emails.put("Gmail_Email","prasanna@com");
		emails.put("Yahoo_Email","prasannasvvl@yahoo.in");
		employee.setEmails(emails);*/
		PermanentEmployee pe=new PermanentEmployee();
		pe.setSalary(32000);
		pe.setBonus(21312F);
		ContractualEmployee ce=new ContractualEmployee();
		ce.setPayPerHour(2000);
		ce.setContractPeriod(12);
		session.save(employee);
		session.save(pe);
		session.save(ce);
		transaction.commit();
		session.close();

	}

}
