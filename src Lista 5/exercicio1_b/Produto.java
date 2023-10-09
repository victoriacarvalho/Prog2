package exercicio1_b;

import java.util.Objects;

public class Produto {

	private String codigo;
	private String nome;
	private float preco;
	
	public Produto(String codigo, String nome, float preco)
	{
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hashCode(getCodigo());
	}
	
	@Override
	public String toString()
	{
		return "\n Produto:  " + "\n C�digo: " + codigo + "\n Nome: " + nome + "\n Pre�o: R$" + preco;
	}
}
