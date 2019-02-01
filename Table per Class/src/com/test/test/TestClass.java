package com.test.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestClass {
	static SessionFactory factory;
	public static void main(String[] args) {
		try{
			 factory  = new AnnotationConfiguration().configure().buildSessionFactory();
			
			 addEmployee("vijay","gund",2);
			 
			 Set<Person> ob=new HashSet<Person>();
		        
	         ob.add(new Person());
	         
	         ob2
	         for (Person person : ob) {
				
	        	 
			}
			 
			 
			 
			}catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	         
	         
	       
	         
	      }
	}
	public static Integer addEmployee(String fname, String lname, int id){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      Integer employeeID = null;
	      try{
	         tx = session.beginTransaction();
	        Student student =new Student(2, "BCS", "vijay", "gund");
	         
	         employeeID = (Integer) session.save(student);
	         System.out.println(employeeID);
	         tx.commit();
	         
	         factory.close();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return employeeID;
	   }
	
	
	
	public static Integer deleteEmployee(String fname, String lname, int id){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      Integer employeeID = null;
	      try{
	         tx = session.beginTransaction();
	         Person person = new Person(id,fname, lname);
	         //Person person = (Person) session.get(Person.class, 1);
	         //Person person = new Person(id,fname, lname);
	         session.delete(person);
	         System.out.println("Person deleted ="+id);
	         tx.commit();
	        
	         factory.close();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return employeeID;
	   }
	
	
	public static Integer updateEmployee(String fname, String lname, int id){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      Integer employeeID = null;
	      try{
	         tx = session.beginTransaction();
	         Person person = new Person(id,fname, lname);
	         //Person person = (Person) session.get(Person.class, 1);
	         //Person person = new Person(id,fname, lname);
	         session.update(person);
	         System.out.println("Person updated ="+id);
	         tx.commit();
	        
	         factory.close();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return employeeID;
	   }
	
	
	
	

}
