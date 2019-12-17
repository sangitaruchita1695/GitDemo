package com.employemodel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test 
{
	public static void main(String[] args) 
	{
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();

		//to insert values
		/*Employe e=new Employe();
		e.setId(2);
		e.setName("Manish Chaudhari");
		e.setAddr("Pune");
		session.save(e);
		session.beginTransaction().commit();*/
		
		//to select values
		Employe e=session.get(Employe.class, 2);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAddr());
}
}
