package com.cts.training.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.cts.training.hibernate.HibernateUtil;
import com.cts.training.model.Sector;
import com.cts.training.model.User;
public class SectorDAOImpl 
{
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	public boolean saveSector(Sector sector) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(sector);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean updateSector(Sector sector) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.update(sector);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean daleteSector(Sector sector) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.delete(sector);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
	public Sector getSectorById(int id) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			Sector sector = session.get(Sector.class, id);
			tx.commit();
			session.close();
			return sector;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<Sector> getAllSectors() {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			List<Sector> sector = session.createQuery("from Sector").list();
			tx.commit();
			session.close();
			return sector;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
}
