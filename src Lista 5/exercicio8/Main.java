package exercicio8;

import java.util.Scanner;

public class Main {

	public static void main (String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		Subtracao sub = new Subtracao();
		int resultado = 0; 
		
		System.out.print("Iniciando a subtração ");
		
		try
		{ 
			System.out.print("\n Digite o primeiro número: \n ");
			sub.setX(ler.nextInt());
			
			System.out.print("\n Digite o segundo número: \n ");
			sub.setY(ler.nextInt());
			
			resultado = sub.subtracao(sub.getX(), sub.getY());
			System.out.println("\n Resultado: " + resultado);
	
		}catch(SubtracaoException e)
		{
			System.out.println("\n Erro de execução: " + e.getMensagem());	
		}finally
		{
			System.out.println("\n Saindo do programa ");	
		}
	}
}
