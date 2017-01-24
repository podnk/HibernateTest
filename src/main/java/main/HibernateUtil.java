package main;

import org.hibernate.SessionFactory;
//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
/*
public class HibernateUtil 
{
	private static final SessionFactory sessionFactory = buildSessionFactory();
	 
    private static SessionFactory buildSessionFactory() 
    {
        try 
        {
            return new AnnotationConfiguration().configure().buildSessionFactory();
 
        }
        catch (Exception ex) 
        {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() 
    {
        return sessionFactory;
    }
 
    public static void shutdown() 
    {
    	getSessionFactory().close();
    }
}
*/

public class HibernateUtil
{
	private static SessionFactory sessionFactory = null;
	
	static
	{
		Configuration cfg = new Configuration().configure();
		sessionFactory = cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}
