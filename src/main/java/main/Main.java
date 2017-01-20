package main;

import org.hibernate.SessionFactory;

public class Main
{
	public static void main(String[] args)
	{
		HibernateUtil h = new HibernateUtil();
		SessionFactory sessionFactory = h.getSessionFactory();
	}
}
