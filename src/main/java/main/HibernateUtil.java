package main;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	private static SessionFactory sessionFactory = null;

	static 
	{
		System.out.println("HibernateUtil");
		
		Configuration cfg = new Configuration().configure();
		
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties());
		
		sessionFactory = cfg.buildSessionFactory(builder.build());
	}

	public static SessionFactory getSessionFactory()
	{
		System.out.println("getSessionFactory");		
		return sessionFactory;
	}
}