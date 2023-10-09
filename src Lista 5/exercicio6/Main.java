package exercicio6;

public class Main {

	public static void main (String[] args)
	{
		FazConta conta = new FazConta ();
		
		conta.deposita(23);
		conta.setLimite(1000);
		System.out.println(conta);
		
		conta.deposita(100);
		System.out.println(conta);
		conta.deposita(10);
		System.out.println(conta);
		conta.deposita(60);
		System.out.println(conta);
		conta.deposita(35);
	    System.out.println(conta);
	    
	    try{
	          conta.saca(1380);
	          System.out.println(conta);
	        }catch(ContaExcecao e){
	            System.out.println("Erro: " + e.getMensagem());
	        }
		
	}
}
