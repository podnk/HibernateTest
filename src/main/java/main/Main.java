package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main
{
	public static void main(String[] args)
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		sessionFactory.close();
	}
}
