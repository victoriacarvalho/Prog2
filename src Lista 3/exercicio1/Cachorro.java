package exercicio1;

public class Cachorro extends Animal{

	private String raca;

	public Cachorro(String nome)
	{
		super(nome);
	}
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String toString()
	{
		 return "\n\tCachorro" + "\nNome: " + getNome() + "\nPeso: " + getPeso() + "kg" + "\nRaça: " + getRaca() + '\n';
	}
}
