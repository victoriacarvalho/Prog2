package exercicio6;

public class FazConta {
	
	private float saldo;
	private float limite;

	public void deposita(float saldo)
	{
		this.saldo += saldo;
	}

	public void saca(float saldo) throws ContaExcecao{
		if(this.saldo < saldo)
		{
			ContaExcecao e = new ContaExcecao("\n Não há saldo suficiente");
			throw e;
		}
		this.saldo -= saldo;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public String toString()
	{
		return "\n\tConta" + "\nSaldo: R$" + saldo + "\nLimite: R$" + limite;
	}
}