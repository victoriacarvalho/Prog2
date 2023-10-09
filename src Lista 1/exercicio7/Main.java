package exercicio7;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		double total = 0;
		int i, k = 1;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n Quantos produtos deseja colocar na fatura? ");
		int quantidade = ler.nextInt();
	
		Invoice venda[] = new Invoice[quantidade];
		
		for(i = 0; i < venda.length; i++)
		{
			venda[i] = new Invoice();
			venda[i].setItem(i+1);
			
			ler.nextLine();
			System.out.println("\n Digite a descrição do item " +k+ ":");
			String description = ler.nextLine();
			venda[i].setDescription(description);
			
			System.out.println("\n Digite a quantidade comprada do item " + k + ":");
			venda[i].setQuantidade(ler.nextInt());
			
			System.out.println("\n Digite o preço unitário do item " + k + ":");
			venda[i].setPreco(ler.nextDouble());
			
			ler.close();
			total += venda[i].getInvoiceAmount();
			k++;
		}
		k = 1;
		
		for(Invoice element: venda)
		{
			System.out.println(" \n");
			System.out.println("Produto de numero: " + element.getItem());
	        System.out.println("Descrição: " + element.getDescription());
	        System.out.println("Quantidade: " + element.getQuantidade());
	        System.out.println("Preço: " + element.getPreco() + "\n");
		}
		System.out.format(" Total da fatura: %.2f", total);	
	}

}
