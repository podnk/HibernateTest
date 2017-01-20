package main;

import java.io.Serializable;

public class User implements Serializable
{
	private static final long serialVersionUID = 1528553623483700053L;
	private String name;
	private String surname;
	private int age;
	private long id;
	
	public User()
	{
		
	}
	
	public User(long idLong)
	{
		
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}
	
	
}
