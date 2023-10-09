package exercicio1;

public class Peixe extends Animal{
	
	private String tipoHabitat;

	public Peixe(String nome)
	{
		super(nome);
	}
	
	public String getTipoHabitat() {
		return tipoHabitat;
	}

	public void setTipoHabitat(String tipoHabitat) {
		this.tipoHabitat = tipoHabitat;
	}
	
	public String toString()
	{
		 return "\n\tPeixe" + "\nNome: " + getNome() + "\nPeso: " + getPeso() + "kg" + "\nTipo de habitat: " + getTipoHabitat() + '\n';
	}
	
}
