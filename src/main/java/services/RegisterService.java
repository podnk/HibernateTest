package services;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import main.HibernateUtil;
import models.Accounts;

public class RegisterService 
{
	public boolean register(Accounts account)
	{
		Session session = HibernateUtil.openSession();

		if(isUserExists(account))
		{
			return false;  
		}

		Transaction tx = null;
		
		try 
		{
			tx = session.getTransaction();
			tx.begin();
			session.saveOrUpdate(account);       
			tx.commit();
		} 
		catch (Exception e) 
		{
			if (tx != null) 
			{
				tx.rollback();
			}
			e.printStackTrace();
		} 
		finally 
		{
			session.close();
		} 
		return true;
	}

	@SuppressWarnings("rawtypes")
	public boolean isUserExists(Accounts account)
	{
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		
		boolean result = false;
		
		try
		{
			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from User where userId='" + account.getId()+"'");
			Accounts acc = (Accounts)query.uniqueResult();
			tx.commit();
			
			if(acc!=null)
			{
				result = true;
			}
		}
		catch(Exception ex)
		{
			if(tx!=null)
			{
				tx.rollback();
			}
		
		}
		finally
		{
			session.close();
		}
		return result;
	}
}