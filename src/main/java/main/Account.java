package main;

import java.io.Serializable;

public class Account implements Serializable
{
	private static final long serialVersionUID = 1528553623483700053L;
	private long id;
	private String login;
	private String password;
	private String email;
	
	public Account()
	{
		
	}
	
	public Account(long idLong)
	{
		
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getLogin()
	{
		return login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
	
	
}
