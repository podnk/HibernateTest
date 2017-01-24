package main;

import java.util.Iterator;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import models.Product;

public class Main
{
	@SuppressWarnings({ "rawtypes", "deprecation", "unchecked" })
	public static void main(String[] args)
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		List<Object> products = null;
		
		try
		{
			session.beginTransaction();
			
			SQLQuery query = session.createSQLQuery("select * from public.product");
			query.addEntity(Product.class);
			products = query.list();
			
			session.getTransaction().commit();
		}
		catch (Exception e) 
		{
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		finally 
		{
			session.close();
			sessionFactory.close();
		}
		
		for(Iterator iterator = products.iterator(); iterator.hasNext();)
		{
			Product prdct = (Product) iterator.next();
			System.out.println(prdct);
		}
	}
}
