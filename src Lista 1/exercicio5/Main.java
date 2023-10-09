package exercicio5;

import java.util.Scanner;

public class Main {
	
	public static final int TAMANHO = 3;
	
		public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
			
		int matriz[][] = new int [TAMANHO][TAMANHO];
		int i, j, cont = 1;
		
		for(i = 0; i < TAMANHO; i++)
		{
			System.out.println("\n Digite os 3  números da " + cont + "ª linha da matriz :");
			cont++;
			for(j = 0; j < TAMANHO; j++)
			{
				matriz[i][j] = ler.nextInt();
			}
		}
		
		Rotacionar.rotacionar90(matriz);
		
		ler.close();
	}
	
}
