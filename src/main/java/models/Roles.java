package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "roles")
public class Roles extends Model
{
	private static final long serialVersionUID = 432439740745232539L;

	@Column (name = "title")
	private String title;
	
	@ManyToMany (mappedBy = "roles")
	private Set<Accounts> accounts = new HashSet<Accounts>();
	
	public Roles()
	{
		super();
	}
	
	public Roles(Integer id)
	{
		super(id);
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public Set<Accounts> getAccounts()
	{
		return accounts;
	}

	public void setAccounts(Set<Accounts> accounts)
	{
		this.accounts = accounts;
	}
}
