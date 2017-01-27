package main;

public class Main
{
	
	public static void main(String[] args)
	{
		/*SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		RegisterServlet rs = new RegisterServlet();
		
		session.beginTransaction();		
		session.save(rs.getAccount());
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();*/
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

	session.beginTransaction();
		
	Accounts acc1 = new Accounts();
	acc1.setName(name);
	acc1.setSurname(surname);
	acc1.setEmail(email);
	acc1.setLogin(login);
	acc1.setPassword(password);
	acc1.setNoNews(noNews);
	acc1.setLicenseDenied(licenseDenied);
		
	session.save(acc1);
	session.getTransaction().commit();
	session.close();
	session.getSessionFactory().close();
 */

