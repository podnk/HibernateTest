package models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Product extends Model
{
	private static final long serialVersionUID = -7881391014358935700L;
	
	@Column (name = "title")
	private String title;
	
	@Column (name = "price")
	private BigDecimal price;
	
	public Product()
	{
		super();
	}
	
	public Product(long id)
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

	public BigDecimal getPrice()
	{
		return price;
	}

	public void setPrice(BigDecimal price)
	{
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return super.getId() + " - " + title + " - " + price;
	}
	
}
