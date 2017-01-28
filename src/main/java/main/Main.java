package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import servlets.RegisterServlet;

public class Main
{
	public static boolean b = false;
	
	public static void main(String[] args) throws InterruptedException
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		RegisterServlet rs = new RegisterServlet();
		
			System.out.println(1);
			System.out.println(getB()); // тонна флагов
			boolean b2 = Main.getB();
			System.out.println(b2 + " b2 ");
			
		while(getB() == false)
		{
				System.out.println(getB());
				System.out.println(2);
				
			if (getB() == true)
			{		
					System.out.println(getB());
					System.out.println(3);
					
				break;
			}
				System.out.println(getB());
				System.out.println(4);
				
			Thread.sleep(1000);
			
				System.out.println(getB());
				System.out.println(5);
			// continue;
		}
			System.out.println(6);
			
		session.beginTransaction();
		
			System.out.println(7);
			
		session.save(RegisterServlet.getObjectToSave());
		session.getTransaction().commit();
		
			System.out.println(8);
			
		session.close();
		sessionFactory.close();
		
			System.out.println(9);
	}
	
	public static boolean getB()
	{
		return b;
	}
	
	public static void setB(boolean b)
	{
		Main.b = b;
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