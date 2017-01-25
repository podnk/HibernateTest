package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.StringType;

import models.Accounts;

public class Main
{
	static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	static Session session = sessionFactory.openSession();
	
	public static void main(String[] args)
	{
		session.beginTransaction();
		
		String sql = "select id from public.accounts where login = log116";
		
		String pass = session.createSQLQuery(sql).
				addScalar("login", StringType.INSTANCE);
		
		session.close();
		sessionFactory.close();
	}
}


// получение данных

/*
 
 


 */


// отправка данных
/*

Accounts acc1 = new Accounts();
acc1.setLogin("podnk");
acc1.setPassword("21593");
acc1.setEmail("podnk@gmail.com");

session.save(acc1);

 */

