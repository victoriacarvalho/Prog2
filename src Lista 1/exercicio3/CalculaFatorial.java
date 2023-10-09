package exercicio3;

public class CalculaFatorial {
	
	public static int fatorial(int numero)
	{	
		int fat;
		
		if(numero <= 1)
		{
			return 1;
			
		}else {
			fat = (2 * fatorial(numero - 1)) + (3 * fatorial(numero - 2));
			return fat;
		}			
	}
}
