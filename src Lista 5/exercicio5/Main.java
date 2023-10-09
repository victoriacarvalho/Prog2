package exercicio5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

	public static void main (String[] args)
	{
		float x = 0, y = 0;
		int opcao = 0;
		double r = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Eu sei dividir!");
		
		
		do {
			System.out.println("\n Deseja calcular? \n 1. sim \n 2. não \n");
			opcao = teclado.nextInt();
			switch(opcao)
			{
				case 1:
					try{
					System.out.println("\n Informe o primeiro valor: ");
					x = teclado.nextFloat();
					System.out.println("\n Informe o segundo valor: ");
					y = teclado.nextFloat();
					r = (x / y);
					System.out.println("\n O resultado da divisão é " + r);
					
					}catch(InputMismatchException e)
					{
						System.out.println("\n Entrada de dados inválida! ");
						
					}catch(ArithmeticException e)
					{
						System.out.println("\n O valor do denominador não pode ser 0! ");
					}
				break;
				
				case 2:
					System.out.print("\n Saindo do programa... \n");
					break;
					
				default:
					System.out.println("\n Digite uma opção válida! ");
				
			}
			
			System.out.println("\n Continuando... ");
		}while(opcao != 2);
		teclado.close();
	}
}
