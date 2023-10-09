package exercicio5;

public class Rotacionar {

public static final int TAMANHO = 3;
	
	public static void rotacionar90(int m[][])
	{
		int i;
		System.out.println("\n ");

		for(i = 2; i >= 0; i--)
		{
			System.out.print(" " + m[i][0]);
		}	
		System.out.println();
		
		for(i = 2; i >= 0; i--)
		{
			System.out.print(" " + m[i][1]);
		}	
		System.out.println();
		
		for(i = 2; i >= 0; i--)
		{
			System.out.print(" " + m[i][2]);
		}	
		System.out.println();
	}
	
}
