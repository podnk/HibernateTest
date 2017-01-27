package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import models.Accounts;
import servlets.RegisterServlet;

public class Main
{
	public static void main(String[] args)
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		RegisterServlet rs = new RegisterServlet();
		
		session.beginTransaction();
		
		Accounts acc = new Accounts();
		acc.setName(rs.getName());
		acc.setSurname(rs.getSurname());
		acc.setEmail(rs.getEmail());
		acc.setLogin(rs.getLogin());
		acc.setPassword(rs.getPassword());
		
		session.save(acc);
		session.getTransaction().commit();
		
		session.close();
		sessionFactory.close();
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