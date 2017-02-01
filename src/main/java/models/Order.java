package models;

import java.math.BigDecimal;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "[order]")
public class Order extends Model 
{
	private static final long serialVersionUID = 7631194264501456268L;
	
	@ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn (name = "account_id", referencedColumnName="id")
	private Accounts account;
	
	@ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn (name = "product_id", referencedColumnName="id")
	private Product product;
	
	@Column (name = "odred_count")
	private int orderCount;
	
	@Column (name = "price")
	private BigDecimal price;
	
	@Column (name = "status")
	private boolean status;
	
	public Order()
	{
		super();
	}
	
	public Order(int orderCount, BigDecimal price, boolean status)
	{
		super();
		this.orderCount = orderCount;
		this.price = price;
		this.status = status;
	}

	public Accounts getAccount()
	{
		return account;
	}

	public void setAccount(Accounts account)
	{
		this.account = account;
	}

	public int getOrderCount()
	{
		return orderCount;
	}

	public void setOrderCount(int orderCount)
	{
		this.orderCount = orderCount;
	}

	public BigDecimal getPrice()
	{
		return price;
	}

	public void setPrice(BigDecimal price)
	{
		this.price = price;
	}

	public boolean isStatus()
	{
		return status;
	}

	public void setStatus(boolean status)
	{
		this.status = status;
	}
	
	
}
