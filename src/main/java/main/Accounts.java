package main;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
import java.util.HashSet;
import java.util.Set;
*/

@Entity
@Table (name = "accounts")
public class Accounts implements Serializable
{
	private static final long serialVersionUID = 1528553623483700053L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id")
	private long id;
	
	@Column (name = "login", length = 25, unique = true)
	private String login;
	
	@Column (name = "password", length = 25)
	private String password;
	
	@Column (name = "email", unique = true)
	private String email;
	
	//private Set<Roles> role = new HashSet<Roles>();
	
	
	public Accounts()
	{
		
	}
	
	public Accounts(long idLong)
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

//	public Set<Roles> getRole()
//	{
//		return role;
//	}
//
//	public void setRole(Set<Roles> role)
//	{
//		this.role = role;
//	}
}
