package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DBConnection
{
	private static SessionFactory sessionFactory;// = HibernateUtil.getSessionFactory();
	private static Session session;// = sessionFactory.openSession();
	
	public DBConnection()
	{
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
	}
	
	public Session getDBSession()
	{
		return session;
	}
	
	public SessionFactory getDBSessionFactory()
	{
		return sessionFactory;
	}
	
	public void beginTransaction()
	{
		session.beginTransaction();
	}
	
	public void commit(Object saveObject)
	{
		session.save(saveObject);
		session.getTransaction().commit();
	}
	
	public void closeConnection()
	{
		session.close();
		sessionFactory.close();
	}
}
