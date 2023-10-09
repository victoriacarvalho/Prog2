package exercicio10;

public class ExceptionDivisao extends Exception{

	private String mensagem;
		
		public ExceptionDivisao(String mensagem)
		{
			this.mensagem = mensagem;
		}
		
		public String getMensagem()
		{
			return mensagem;
		}
}