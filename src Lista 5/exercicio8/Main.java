package exercicio8;

import java.util.Scanner;

public class Main {

	public static void main (String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		Subtracao sub = new Subtracao();
		int resultado = 0; 
		
		System.out.print("Iniciando a subtra��o ");
		
		try
		{ 
			System.out.print("\n Digite o primeiro n�mero: \n ");
			sub.setX(ler.nextInt());
			
			System.out.print("\n Digite o segundo n�mero: \n ");
			sub.setY(ler.nextInt());
			
			resultado = sub.subtracao(sub.getX(), sub.getY());
			System.out.println("\n Resultado: " + resultado);
	
		}catch(SubtracaoException e)
		{
			System.out.println("\n Erro de execu��o: " + e.getMensagem());	
		}finally
		{
			System.out.println("\n Saindo do programa ");	
		}
	}
}
