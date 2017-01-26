package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "accounts")
public class Accounts extends Model
{
	private static final long serialVersionUID = 5309388339715692260L;

	@Column (name = "login", length = 25, unique = true)
	private String login;
	
	@Column (name = "password", length = 25)
	private String password;
	
	@Column (name = "email", unique = true)
	private String email;
	
	@Column (name = "name", unique = false, length = 25)
	private String name;
	
	@Column (name = "surname", unique = false, length = 25)
	private String surname;
	
	@Column (name = "no_news")
	private boolean noNews;
	
	@Column (name = "license_denied")
	private boolean licenseDenied;
	
	@ManyToMany
	@JoinTable (name = "accounts_roles", 
		joinColumns = {@JoinColumn (name = "accounts_id")}, 
		inverseJoinColumns = {@JoinColumn (name = "roles_id")})
	private Set<Roles> roles = new HashSet<Roles>();
	
	public Accounts()
	{
		super();
	}
	
	public Accounts(Integer id)
	{
		super(id);
	}
	
	public Accounts(String login, String password, String email)
	{
		super();
		this.login = login;
		this.password = password;
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

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public Set<Roles> getRoles()
	{
		return roles;
	}

	public void setRoles(Set<Roles> roles)
	{
		this.roles = roles;
	}
}
