package com.cts.training.dao.impl;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.cts.training.hibernate.HibernateUtil;
import com.cts.training.model.StockExchange;
public class StockExchangeDAOimp
{
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	public boolean saveStockExchange(StockExchange stockexchange) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(stockexchange);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateStockExchange(StockExchange stockexchange) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.update(stockexchange);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean daleteStockExchange(StockExchange stockexchange) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.delete(stockexchange);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public StockExchange getStockExchangeById(int id) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			StockExchange stockexchange = session.get(StockExchange.class, id);
			tx.commit();
			session.close();
			return stockexchange;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<StockExchange> getAllCompanies() {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			List<StockExchange> ses = session.createQuery("from StockExchange").list();
			tx.commit();
			session.close();
			return ses;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
