package exercicio1;

public class Main {
	
	public static void main(String[] args) 
{			
	
	
	float preco[] = new float [3];
	int k = 1;
	
	preco[0] = 10;
	preco[1] = 15;
	preco[2] = 30;
	
	float manicure[][] = new float [5][3];
	float renda[] = new float [5];
	
	Calcula.calculaServicos(manicure);
	Calcula.calculaSalario(preco, manicure, renda);
	
		for(int i = 0; i < 5; i++) 
		{
			System.out.println("\n A manicure " + k + " receberá " + renda[i] + ".");
			k++;
		}
	
	}
	
}

