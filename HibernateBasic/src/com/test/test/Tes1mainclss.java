package com.test.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tes1mainclss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=null;
		tx = session.beginTransaction();
		Person person = new Person(2,"neha","shinde");
		int x=	(Integer) session.save(person);
		System.out.println(x);
		tx.commit();
		session.close();
		sessionFactory.close();

	}

}
