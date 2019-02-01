package com.test.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class annotationtest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=null;
		tx = session.beginTransaction();
		Person2 p=(Person2) session.get(Person2.class, 1);
		
		
		p.setLastName("patil");
		//Person2 person = new Person2(2,"akash","Patil");
		//session.update(p);
		session.delete(p);
		System.out.println("data updated");
		tx.commit();
		session.close();
		sessionFactory.close();

	}

}
