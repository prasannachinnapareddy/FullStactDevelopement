package com.cts.training.controller;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import com.cts.training.model.Actor;
import com.cts.training.model.Movie;
public class MovieController {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		/*Movie movie=new Movie();
		movie.setName("Darling");
		Actor actor=new Actor();
		actor.setActorName("prabhas");
		actor.setMovie(movie);
		Actor actor1=new Actor();
		actor1.setActorName("Bunny");
		actor1.setMovie(movie);
		session.save(movie);
		session.save(actor);
		session.save(actor1);*/
		Criteria criteria = session.createCriteria(Actor.class);
		List<Actor> actor=criteria.add(Restrictions.eq("actorName", "Prabhas")).list();
		for(Actor a : actor)
			System.out.println(a.getMovie().getName());
		tx.commit();
		session.close();
	}

}
