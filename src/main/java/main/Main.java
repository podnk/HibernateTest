package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;
import models.Accounts;

public class Main
{
	public static void main(String[] args)
	{
		
	}
}


// получение данных

/*
 
static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
static Session session = sessionFactory.openSession();
 
session.beginTransaction();

String sql = "select id from public.accounts where login = 'podnk'";

int id = (Integer)session.createSQLQuery(sql).
addScalar("id", IntegerType.INSTANCE).uniqueResult();

System.out.println(id);

session.close();
sessionFactory.close();


 */


// отправка данных
/*

Accounts acc1 = new Accounts();
acc1.setLogin("podnk");
acc1.setPassword("21593");
acc1.setEmail("podnk@gmail.com");

session.save(acc1);

 */

