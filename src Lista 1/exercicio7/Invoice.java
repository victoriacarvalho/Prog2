package exercicio7;

public class Invoice {

	private int item;
	private String description;
	private int quantidade = 0;
	private double preco = 0.0;
	
	Invoice(){}
	
	Invoice(int item, String description,int quantidade, double preco)
	{
		this.item = item;
		this.description = description;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public void setItem(int item)
	{
		this.item = item;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public void setQuantidade(int quantidade)
	{
		this.quantidade = quantidade;
	}
	
	public void setPreco(double preco)
	{
		this.preco = preco;
	}
	
	public int getItem()
	{
		return item;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public int getQuantidade()
	{
		return quantidade;
	}
	
	public double getPreco()
	{
		return preco;
	}
	 
	public double getInvoiceAmount()
	{
		double amount = preco * quantidade;
		
		if(quantidade < 0)
		{
			this.quantidade = 0;
		}
		
		if(preco < 0)
		{
			this.preco = 0.0;
		}
		
		return amount;
	}

}
