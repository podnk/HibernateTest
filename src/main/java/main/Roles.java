package main;

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
@Table (name = "roles")
public class Roles
{
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id")
	private Long id;
	
	@Column (name = "title")
	private String title;
	
	//private Set<Accounts> accounts = new HashSet<Accounts>();
	
	public Roles()
	{
		
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	/*public Set<Accounts> getAccounts()
	{
		return accounts;
	}

	public void setAccounts(Set<Accounts> accounts)
	{
		this.accounts = accounts;
	}*/
}
