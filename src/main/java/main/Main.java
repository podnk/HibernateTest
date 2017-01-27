package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import models.Accounts;
import servlets.RegisterServlet;

public class Main
{
	public static void main(String[] args)
	{
		// Подключение к БД
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		RegisterServlet rs = new RegisterServlet();
		
		// Начало транзакции
		session.beginTransaction();
		
		// Создание объекта класса Аккаунта и занесение значений
		// из RegisterServlet
		Accounts acc = new Accounts();
		acc.setName(rs.getName());
		acc.setSurname(rs.getSurname());
		acc.setEmail(rs.getEmail());
		acc.setLogin(rs.getLogin());
		acc.setPassword(rs.getPassword());
		
		// Сохранение аккаунта и передача его объекта в БД
		session.save(acc);					// тут NullPointerException
		session.getTransaction().commit();
		
		// Закрытие сессии
		session.close();
		sessionFactory.close();
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