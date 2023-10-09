package exercicio1;

import java.util.Scanner;

public class Calcula {
	
	public static void calculaServicos(float manicure[][])
	{
		Scanner ler = new Scanner(System.in);
		int k = 1;
		System.out.println("\n Digite quantos serviços foram feitos por cada manicure");
		System.out.println(" Coloque em ordem os serviços de pés, mãos e podologia respectivamente: ");
		
			for(int i = 0; i < 5; i++)
			{
				System.out.println ("\n Manicure " + k + " digite a quantidade de serviços feitos separando - os \n  ");
				
				for(int j = 0; j < 3; j++)
				{
					manicure[i][j] = ler.nextFloat();
				}
				
				k++;
			}		
			ler.close();
	}

	public static void calculaSalario(float preco[], float manicure[][], float renda[])
	{
		float soma[] = new float [5];
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				soma[i] = soma[i] + (manicure[i][j] * preco[j]);
			}
		}
		
		for(int i=0; i < 5; i++) 
		{
			renda[i] = soma[i] /2;
		}
	}

}
