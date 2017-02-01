package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil 
{
    private static final SessionFactory sessionFactory;
 
    static 
    {
        try 
        {
            sessionFactory = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
        } 
        catch (Throwable ex) 
        {
            System.err.println("Проблема с инициализацией SessionFactory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static Session openSession() 
    {
        return sessionFactory.openSession();
    }
    
    public static SessionFactory getSessionFactory()
    {
    	return sessionFactory;
    }
}
