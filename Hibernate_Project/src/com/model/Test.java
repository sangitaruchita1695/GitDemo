package com.model;

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
	StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
	MetadataSources mds=new MetadataSources(registry);
	Metadata md=mds.getMetadataBuilder().build();
	SessionFactory sf=md.getSessionFactoryBuilder().build();
	Session session=sf.openSession();
	Studentt stu=session.get(Studentt.class, 1);
	System.out.println(stu.getRollno());
	System.out.println(stu.getName());
	System.out.println(stu.getAddr());
	/*Studentt stu=new Studentt();
	stu.setRollno(1);
	stu.setName("Ruchita");
	stu.setAddr("Pune");
	session.save(stu);
	session.beginTransaction().commit();*/

}
}
