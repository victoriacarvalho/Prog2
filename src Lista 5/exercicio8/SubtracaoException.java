package exercicio8;

public class SubtracaoException extends Exception{

	private String mensagem;
		
		public SubtracaoException(String mensagem)
		{
			this.mensagem = mensagem;
		}
		
		public String getMensagem()
		{
			return mensagem;
		}
}
