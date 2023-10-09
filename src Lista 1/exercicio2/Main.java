package exercicio2;

public class Main {
	
	public static final int QUANTIDADE = 50;
	
	public static void main(String[] args) 
 {	
	String nome = "";
	int ideal[] = new int [QUANTIDADE];
	int estoque[] = new int[QUANTIDADE];
	
	Calcula.cadastraPlantas(nome,ideal,estoque);
	Calcula.calculaEstoque(nome,ideal,estoque);
 }
	
}