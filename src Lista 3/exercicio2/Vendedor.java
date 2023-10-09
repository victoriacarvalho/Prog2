package exercicio2;

public class Vendedor extends Empregado{

	private double valorVendas;
	private int qntVendas;
	
	public Vendedor(String nome)
	{
		super(nome);
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public int getQntVendas() {
		return qntVendas;
	}

	public void setQntVendas(int qntVendas) {
		this.qntVendas = qntVendas;
	}
	
	public String toString()
	{
		 return "\nNome: " + getNome() + "\nSalário: R$" + getSalario()  + "\nValor das vendas: R$" + getValorVendas() + "\nQuantidade de vendas: " +getQntVendas() + '\n';
	}
}
