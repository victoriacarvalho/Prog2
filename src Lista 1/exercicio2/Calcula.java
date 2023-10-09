package exercicio2;

import java.util.Scanner;

public class Calcula {
public static final int QUANTIDADE = 50;
	
	public static void cadastraPlantas(String plantas, int disponivel[], int estoqueIdeal[])
	{
		Scanner ler = new Scanner(System.in);
		
		int k = 1;	
		System.out.println("\n Cadastro de plantas: ");
		System.out.println(" Digite o nome da planta ");
		
		for(int i = 0; i < QUANTIDADE; i++)
		{
			System.out.println("\n Planta " + k + " :");
			String planta = ler.nextLine();
			
			System.out.println("\n Quantidade em estoque da planta " + planta + " :");
			disponivel[i] = ler.nextInt();
			
			System.out.println("\n Quantidade ideal da planta " + planta + " :");
			estoqueIdeal[i] = ler.nextInt();
			
			k++;
		}		
		ler.close();
	}

	public static void calculaEstoque(String planta, int disponivel[], int estoqueIdeal[])
	{
		int quantidade[] = new int [QUANTIDADE] ;
		int k = 1;	
		
		for(int i = 0; i < QUANTIDADE; i++)
		{
			if(disponivel[i] < estoqueIdeal[i])
			{
				quantidade[i] = estoqueIdeal[i] - disponivel[i];
				System.out.println(" Você precisa comprar mais " + quantidade[i] + " unidades da planta " + k );
			}
			k++;
		}
	}

}
