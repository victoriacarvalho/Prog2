package exercicio1;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
	
	public static void main (String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		String nome;
		Set<String> nomes = new HashSet<String>();
		
		
		do {
		
			System.out.println("\n ----------MENU----------");
			
			System.out.println("\n\t1. Cadastrar");
            System.out.println("\n\t2. Pesquisar");
            System.out.println("\n\t3. Imprimir");
            System.out.println("\n\t4. Excluir nome");
            System.out.println("\n\t5. Excluir todos os nomes");
            System.out.println("\n\t6. Sair ");
            
            System.out.println("\n Escolha uma op��o: ");
            opcao = ler.nextInt();
            
            switch(opcao)
            {
            	case 1:
            		ler.nextLine();
            		System.out.println(" Digite o nome que deseja adicionar: ");
            		nome = ler.nextLine();
            		
            		if(nomes.add(nome))
            		{
            			System.out.print(" Nome cadastrado! ");
            	
            		}else {
            			System.out.print(" O nome digitado j� foi cadastrado. ");
            			
            		}
            		break;
            		
            	case 2:
            		ler.nextLine();
            		System.out.println(" Digite o nome que deseja pesquisar: ");
            		nome = ler.nextLine();
            		
            		if(nomes.contains(nome))
            		{
            			System.out.print(" Nome cadastrado! ");
            	
            		}else {
            			System.out.print(" O nome digitado n�o foi cadastrado. \n ");
            			
            		}
            		break;
            		
            	case 3:
            		if(!nomes.isEmpty())
            		{
            			for(String n: nomes)
            			{	
            				System.out.println(n);
            			}
            			
            		}else {
            			System.out.println(" N�o h� nomes cadstrados ");
            		}
            		break;
            		
            	case 4:
            		 System.out.println(" Digite o nome que deseja excluir: ");
                     nome = ler.next();

                     if(nomes.contains(nome))
                     {
                         nomes.remove(nome);
                         System.out.println(" Nome excluido com sucesso!");
                         
                     }else{
                         System.out.println(" ERRO: Nome n�o encontrado!");
                     }
                     break;
                     
                 case 5:
                     nomes.clear();
                     System.out.println(" Todos os nomes foram excluidos! ");
                     break;
                     
                 case 6:
                     System.out.println(" Saindo do programa ");
                     break;
                     
                 default:
                     System.out.println(" Digite uma op��o v�lida! ");
                     
            }
		}while(opcao != 6);
		
		ler.close();
	}
}
