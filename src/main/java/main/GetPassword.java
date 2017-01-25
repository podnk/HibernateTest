package main;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GetPassword
{
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	private Session session = sessionFactory.openSession();
	
	private String sqlString;
	private SQLQuery query = session.createSQLQuery(sqlString);
	
	public GetPassword()
	{
		
	}
	
	public GetPassword(String sqlString)
	{
		this.sqlString = sqlString;
	}

	public void setSqlString(String sqlString)
	{
		this.sqlString = sqlString;
	}
	
	public SQLQuery getQuery()
	{
		return query;
	}
	
	public void beginTransaction()
	{
		session.beginTransaction();
	}
	
	public void commit()
	{
		session.getTransaction().commit();
	}
}
