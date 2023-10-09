package exercicio2;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main (String[] args)
    {
        Scanner ler = new Scanner(System.in);

        int opcao = 0;
        String id, nome, cargo;
        float salario;
        Map<String, Funcionario> funcionario = new HashMap<>();

        try {
            do {

                System.out.println("\n\t ----------MENU---------- ");
                System.out.println("\n\t 1. Cadastrar ");
                System.out.println("\n\t 2. Pesquisar ");
                System.out.println("\n\t 3. Imprimir ");
                System.out.println("\n\t 4. Sair");


                System.out.println("\n Digite uma op��o:  ");
                opcao = ler.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("\n Digite a ID do funcion�rio:  ");
                        id = ler.next();

                        nome = ler.nextLine();
                        System.out.println("\n Digite o nome do funcion�rio:  ");
                        nome = ler.nextLine();

                        System.out.println("\n Digite o cargo do funcion�rio:  ");
                        cargo = ler.nextLine();

                        System.out.println("\n Digite o sal�rio do funcion�rio:  ");
                        salario = ler.nextFloat();

                        if (!funcionario.containsKey(id)) {
                            funcionario.put(id.toLowerCase(), new Funcionario(id.toLowerCase(), nome, cargo, salario));

                        } else {
                            System.out.println("\n Erro. Funcion�rio j� cadastrado. ");
                        }
                        break;

                    case 2:
                        System.out.println("\n Digite a ID do funcion�rio que deseja pesquisar:  ");
                        id = ler.next();

                        if (funcionario.containsKey(id.toLowerCase())) {
                            System.out.println(funcionario.get(id.toLowerCase()));

                        } else {
                            System.out.println("\n Funcion�rio n�o encontrado. ");
                        }
                        break;

                    case 3:
                        for (String chave : funcionario.keySet()) {
                            System.out.println(funcionario.get(chave));
                        }
                        break;

                    case 4:
                        System.out.println("\n Saindo do programa ");
                        break;

                    default:
                        System.out.println("\n Digite uma op��o v�lida ");
                }

            } while (opcao != 4);
        }catch (Exception e){
            System.out.println("Tecla inv�lida. Reinicie o programa");
        }
        ler.close();
    }
}
