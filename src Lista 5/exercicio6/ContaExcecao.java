package exercicio6;

public class ContaExcecao extends Exception{
	
	private String mensagem;
	
	public ContaExcecao(String mensagem)
	{
		this.mensagem = mensagem;
	}
	
	public String getMensagem()
	{
		return mensagem;
	}

}
