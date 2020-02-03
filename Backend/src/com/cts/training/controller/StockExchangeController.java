package com.cts.training.controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.cts.training.model.StockExchange;
public class StockExchangeController
{
	public static void main(String[] args) 
	{			
				Configuration cfg = new Configuration();
				cfg.configure();
				SessionFactory sessionFactory = cfg.buildSessionFactory();
				Session session = sessionFactory.openSession();
				Transaction transaction = session.beginTransaction();
			    StockExchange stockexchange = new StockExchange();
				session.save(stockexchange);
				StockExchange getStockExchange=session.get(StockExchange.class, 103);
				//getUser.setEnabled(true);
				//getUser.setPassword("9999");
				//session.update(getStockExchange);
				//session.delete(getStockExchange);
				transaction.commit();
				session.close();
	}
}
