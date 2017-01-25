package main;

import org.hibernate.Session;
import main.GetPassword;
import org.hibernate.SessionFactory;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			session.beginTransaction();
			
			
			
			session.getTransaction().commit();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			session.close();
			sessionFactory.close();
		}
		
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

