package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "accounts")
public class Accounts extends Model
{
	private static final long serialVersionUID = 5309388339715692260L;

	@Column (name = "name", unique = false, length = 25)
	private String name;
	
	@Column (name = "surname", unique = false, length = 25)
	private String surname;
	
	@Column (name = "email", unique = true)
	private String email;
	
	@Column (name = "login", length = 25, unique = true)
	private String login;
	
	@Column (name = "password", length = 25)
	private String password;
	
	public Accounts()
	{
		super();
	}
	
	public Accounts(String login, String password, String email, 
			String name, String surname)
	{
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.login = login;
		this.password = password;
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

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
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
}
