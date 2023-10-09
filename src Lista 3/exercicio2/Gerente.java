package exercicio2;

public class Gerente extends Empregado{

	private String nomeGerencia;
	
	public Gerente(String nome)
	{
		super(nome);
	}

	public String getNomeGerencia() {
		return nomeGerencia;
	}

	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}
	
	public String toString()
	{
		 return "\nNome: " + getNome() + "\nIdade: " + getIdade()  + "\nMatrícula: " + getMatricula() + "\nNome da gerência: " + getNomeGerencia() + "\nValor do INSS: R$" + valorInss() + '\n';
	}
	
}
