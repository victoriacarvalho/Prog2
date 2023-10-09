package exercicio2;

import java.util.Scanner;

public class Jogo {
	
	 Scanner ler = new Scanner(System.in);
	
	final int TAMANHO = 3;
	public String jogo[][] = new String [TAMANHO][TAMANHO];
	public String jogador1[] = new String [50];
	public String jogador2[] = new String [50]; 
	
	public void inicializaMatriz()
	{
		int i, j;
		
		for(i = 0; i < TAMANHO; i++)
			for(j = 0; j < TAMANHO; j++)
			{
				jogo[i][j] = "";
			}
	}
	
	public int valido(String letra)
	{
		if (letra == "x" || letra == "0")
		{
			return 1;
			
		}else {
			return 0;
		}
	}
	
	public int coordenadaValida(int x, int y)
	{
		if(x >= 0 && x < TAMANHO)
		{
			if(y >= 0 && y < TAMANHO)
			{
				return 1;
			}
		}
		return 0;
	}
	
	public int posicaoVazia(int x, int y)
	{
		if(jogo[x][y] != "x" && jogo[x][y] != "0")
		{
			return 1;
		}
			return 0;
	}
	
	public int VenceuLinha()
	{
		int i, j, igual = 1;
		
		for(i = 0; i < TAMANHO; i++)
		{
			for(j = 0; j < 2; j++)
			{
				if(valido(jogo[i][j]) && jogo[i][j] == jogo[i][j+1])
				{
					igual++;
				}
				
				if(igual == 3)
				{
					return 1;
					igual = 1;
				}
			}
		}
		return 0;
	}
	
	public int VenceuColuna()
	{
		int i, j, igual = 1;
		
		for(i = 0; i < TAMANHO; i++)
		{
			for(j = 0; j < 2; j++)
			{
				if(valido(jogo[i][j]) && jogo[i][j] == jogo[i][j++])
				{
					igual++;
				}
				
				if(igual == 3)
				{
					return 1;
					igual = 1;
				}
			}
		}
		return 0;
	}
	
	public int ganhouDiagonalP()
	{
		int i, j, igual = 1;
			
			for(i = 0; i < TAMANHO; i++)
			{
				for(j = 0; j < 2; j++)
				{
					if(valido(jogo[i][j]) && jogo[i][j] == jogo[i][j++])
					{
						igual++;
					}
					
					if(igual == 3)
					{
						return 1;
						igual = 1;
					}
				}
			}
			return 0;
	}
	

	public int ganhouDiagonalS()
	{
		int i, j, igual = 1;
			
			for(i = 0; i < TAMANHO; i++)
			{
				for(j = 0; j < 2; j++)
				{
					if(valido(jogo[i][j]) && jogo[i][j] == jogo[i][j++])
					{
						igual++;
					}
					
					if(igual == 3)
					{
						return 1;
						igual = 1;
					}
				}
			}
			return 0;
	}
	
	public void imprimir()
	{
		int lin, col;
		
		System.out.print("\n\t   0  1  2\n");
		
		for(lin = 0; lin < TAMANHO; lin++)
		{
			System.out.print("\t" + lin);
			
			for(col = 0; col < TAMANHO; col++)
			{
				System.out.print("\t" + col);
				if(col < 2)
				{
				   System.out.print(" | " + jogo[lin][col]);
				   
				}else {
					System.out.print("  " + jogo[lin][col]);
				}
					if(lin < 2)
						System.out.print("\n\t   ----------\n");
			}	
		}
}
	
	public void jogar()
	{
		int x, y, valida, jogadas = 0, ganhou = 0, ordem = 1;
		
		do {
			do {
				imprimir();
				System.out.print("\n Digite a cordenada da linha que deseja jogar \n EX: linha 3 digite 3 : ");
				 x = ler.nextInt();
				 System.out.print("\n Digite a cordenada da coluna que deseja jogar \n EX: coluna 2 digite 2 : ");
				 y = ler.nextInt();
				 
				 valida = coordenadaValida(x,y);
				 
				 if(valida == 1)
				 {
					 valida += posicaoVazia(x,y);
				 }
					 
				 }while(valida != 2);
				 
			if(ordem == 1)
			{
				jogo[x][y] = "x";
				
			}else {
				jogo[x][y] = "0";
			}
			jogadas++;
			ordem++;
			
			if(ordem == 3)
			{
				ordem = 1;
			}
			
			ganhou += VenceuLinha();
			ganhou += VenceuColuna();
			ganhou += ganhouDiagonalP();
			ganhou += ganhouDiagonalS();
			
		}while(ganhou == 0 && jogadas < 9);
		
		if(ganhou != 0)
		{
			imprimir();
			
			if(ordem-- == 1)
			{
				System.out.print("\n Voce venceu! " + jogador1);
				
			}else {
				System.out.print("\n Voce venceu! " + jogador2);	
			}
		}
	}

}
