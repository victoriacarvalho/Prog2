package exercicio3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int numero, f;
		
		System.out.println("\n Digite o número que deseja calcular: \n ");
		numero = ler.nextInt();
		
		f = CalculaFatorial.fatorial(numero);
		
		System.out.println("\n Fatorial de " + numero + " " + f);
		
		ler.close();
	}
}

