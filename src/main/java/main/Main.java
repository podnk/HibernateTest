package main;

public class Main
{
	public static void main(String[] args)
	{
		
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
___________________________________________________________________________________

	Accounts acc1 = new Accounts();
	acc1.setLogin("login");
	acc1.setPassword("password");
	acc1.setEmail("email");
		
	session.beginTransaction();
	session.save(acc1);		
	session.getTransaction().commit();
	session.close();
	sessionFactory.close();
 */

