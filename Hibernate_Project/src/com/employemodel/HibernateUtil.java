package com.employemodel;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil 
{
	public static SessionFactory getSessionFactory()
	{
	StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
	MetadataSources mds=new MetadataSources(registry);
	Metadata md=mds.getMetadataBuilder().build();
	SessionFactory sf=md.getSessionFactoryBuilder().build();
	return sf;
	}
}
