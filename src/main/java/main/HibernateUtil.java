package main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	private static SessionFactory sessionFactory;

	static 
	{
		try
		{
			Configuration configuration = new Configuration().configure();
			sessionFactory = configuration.buildSessionFactory();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

	public static SessionFactory getSessionFactory()
	{
		System.out.println("getSessionFactory");		
		return sessionFactory;
	}
}