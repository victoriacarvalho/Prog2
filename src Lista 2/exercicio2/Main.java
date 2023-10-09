package exercicio2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
	Jogo jogo = new Jogo();
	Jogo jogador1 = new Jogo();
	Jogo jogador2 = new Jogo();
	
	Scanner ler = new Scanner(System.in);
	
	int op, i;
	
	System.out.print("\n Jogador 1 digite seu nome " );
	jogo.jogador1 = ler.nextLine();
	
	System.out.print("\n Jogador 2 digite seu nome " );
	jogo.jogador2 = ler.nextLine();

	do {
		
		jogo.inicializaMatriz();
		jogo.jogar();
		
		System.out.print("Jogar novamente? \n 1 - SIM \n 2 - NÃO\n ");
		op = ler.nextInt();
		
	}while(op == 1);
	
	
	
	
	ler.close();
}
}
