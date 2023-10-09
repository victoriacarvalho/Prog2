package exercicio2;

public class Empregado extends Pessoa{
	
	private double salario;
	private String matricula;
	
	public Empregado(String nome)
	{
		super(nome);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double valorInss()
	{
		double valor;
		
		valor = salario * 0.11;
		return valor;
	}

}
