package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import models.Accounts;
import servlets.RegisterServlet;

public class Main
{
	public static void main(String[] args) throws InterruptedException
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		RegisterServlet rs = new RegisterServlet();
			//System.out.println(1);
		while(rs.b == false)
		{
				//System.out.println(2);
			if (rs.b == true)
			{
				//System.out.println(3);
				break;
			}
				//System.out.println(4);
			Thread.sleep(4000);
				//System.out.println(5);
			continue;
		}
			//System.out.println(6);
		session.beginTransaction();
			//System.out.println(7);
		session.save(RegisterServlet.getObjectToSave());
		session.getTransaction().commit();
			//System.out.println(8);
		session.close();
		sessionFactory.close();
			//System.out.println(9);
	}
}



























/*
	session.beginTransaction();
	
	String sql = "select id from public.accounts where login = 'podnk'";
	
	int id = (Integer)session.createSQLQuery(sql).
	addScalar("id", IntegerType.INSTANCE).uniqueResult();
	
	System.out.println(id);
	
	session.close();
	sessionFactory.close();
	
	____________________________________________
	
	
	Accounts acc = new Accounts();
	acc.setName(rs.getName());
	acc.setSurname(rs.getSurname());
	acc.setEmail(rs.getEmail());
	acc.setLogin(rs.getLogin());
	acc.setPassword(rs.getPassword());
*/