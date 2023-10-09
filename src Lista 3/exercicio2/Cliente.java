package exercicio2;

public class Cliente extends Pessoa{
	
	private double valorDivida;
	private int anoNascim;
	
	public Cliente(String nome)
	{
		super(nome);
	}
	
	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public int getAnoNascim() {
		return anoNascim;
	}

	public void setAnoNascim(int anoNascim) {
		this.anoNascim = anoNascim;
	}


	public String toString()
	{
		 return "\t\nNome: " + getNome() + "\nIdade: " + getIdade()  + "\nSexo: " + getSexo() + "\nValor da dívida: R$" + getValorDivida() + "\nAno de nascimento: " + getAnoNascim() + '\n';
	}
	
}
