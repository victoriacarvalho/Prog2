package exercicio10;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		Calculator calc = new Calculator();
		double resultado = 0; 
		int opcao = 0;
		
		System.out.print("\t Vamos dividir !!! \n  ");
		
		try
		{ 
			do {
				System.out.println("\n Escolha uma opção: ");
				System.out.println("\n 1. Dividir ");
				System.out.println("\n 2. Log 10 ");
				System.out.println("\n 3. Sair ");
				
				opcao = ler.nextInt();
				
				switch(opcao)
				{
					case 1:
						System.out.println("\n Digite o primeiro valor: ");
                        calc.setX(ler.nextDouble());
                        
                        System.out.println("\n Digite o segundo valor: ");
                        calc.setY(ler.nextDouble());
                        
                        resultado = calc.div(calc.getX(), calc.getY());
                        System.out.println("\n Resultado: " + resultado);
                        break;
                        
					case 2:
						System.out.println("\n Digite o valor: ");
                        calc.setX(ler.nextDouble());
                        
                        resultado = calc.log10(calc.getX());
                        System.out.println("\n Resultado: " + resultado);
                        break;
                        
					case 3:
						 System.out.println("\n Saindo do programa!");
						 break;
						 
					default:
                        System.out.println("\n Digite uma opção válida!");
				}
				
			}while(opcao != 3);
			
			ler.close();
			
		}catch(ExceptionDivisao e)
		{
			System.out.println("Erro: " + e.getMensagem());
		}
	}
}
