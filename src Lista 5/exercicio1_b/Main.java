package exercicio1_b;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main (String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		int opcao = 0;
		Set<Produto> produtos = new HashSet<>();
		String id, nome;
		float preco;
		
		do {
			System.out.println("\n\t ----------MENU---------- ");
			System.out.println("\n\t 1. Cadastrar ");
			System.out.println("\n\t 2. Imprimir ");
			System.out.println("\n\t 3. Sair ");
			
			
			System.out.println("\n Digite uma opção:  ");
			opcao = ler.nextInt();
			
			switch(opcao)
			{
				case 1:
					ler.nextLine();
					System.out.println(" Digite a Id do produto:  ");
					id = ler.nextLine();
					
					System.out.println(" Digite o nome do produto:  ");
					nome = ler.next();
					
					System.out.println(" Digite o preço do produto:  ");
					preco = ler.nextFloat();
					
					if(produtos.add(new Produto(id, nome, preco)))
					{
						System.out.println(" Produto cadastrado com sucesso! ");
						
					}else {
						System.out.println(" Produto já cadstrado no sistema ");
					}
					
				break;
				
				case 2:
					for(Produto p : produtos)
					{
						System.out.println(p);
					}
					break;
					
				case 3:
					System.out.println(" Saindo do programa ");
					break;
					
				default:
					System.out.println(" Digite algo válido ");
			}
			
		}while(opcao != 3);
		
		ler.close();
	}
}
