package exercicio4;

import java.util.Scanner;

public class Main {
	
	public static final int MESES = 2;
	public static final int SEMANAS = 4;
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		float vendas[][] = new float [MESES][SEMANAS];
		float total = 0, mes = 0;
		int i, j, contSemana = 1, contMes = 1;
		
		for(i = 0; i < MESES; i++)
		{
			contSemana = 1;
			System.out.println("\n Digite as vendas do mês " + contMes + ":");
			for(j = 0; j < SEMANAS; j++)
			{	
				System.out.println("\n Semana " + contSemana + ":");
				vendas[i][j] = ler.nextFloat();
				contSemana++;
			}	
			contMes++;
		}
			
		contMes = 1;
		for(i = 0; i < MESES; i++)
		{
			mes = 0;
			contSemana = 1;
			
			System.out.println("\n \n Mês " + contMes + ": ");
			for(j = 0; j < SEMANAS; j++)
			{
				System.out.println("\n Total vendido na semana " + contSemana + ": " + vendas[i][j]);
				mes += vendas[i][j];
				total += vendas[i][j];
				contSemana++;
			}
			contMes++;
			System.out.println("\n Total vendido no mes: " + mes);	
		}
		
		System.out.println("\n \n Total vendido no ano: " + total);
		ler.close();
	}
}
