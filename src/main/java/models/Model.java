package models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Model implements Serializable
{
	private static final long serialVersionUID = -4005034759568576232L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id")
	private long id;
	
	public Model(){}
	
	public Model(long id)
	{
		this.id = id;
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
