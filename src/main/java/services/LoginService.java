package services;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import models.Accounts;
import main.HibernateUtil;

public class LoginService
{
	public boolean authenticateAccount(String login, String password)
	{
		Accounts accounts = getAccountByLogin(login);
		
		if (accounts != null && accounts.getLogin().equals(login) && accounts.getPassword().equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Accounts getAccountByLogin(String login)
	{
		Session session = HibernateUtil.openSession();
		Transaction transaction = null;
		Accounts accounts = null;
		
		try
		{
			transaction = session.getTransaction();
			transaction.begin();
			
			@SuppressWarnings("rawtypes")
			Query query = session.createQuery("from public.accounts where login='" 
					+ login + "'");
			accounts = (Accounts)query.uniqueResult();
			transaction.commit();
		}
		catch(Exception ex)
		{
			if (transaction != null)
			{
				transaction.rollback();
			}
		}
		finally
		{
			session.close();
		}
		return accounts;
	}
}
