package exercicio8;

public class Main {
	
	public static void main(String[] args) {
		IntergerSet set1 = new IntergerSet(10);
		IntergerSet set2 = new IntergerSet(10);
		IntergerSet auxiliar = new IntergerSet(10);

        set1.add(7);
        set1.add(1);
        set1.add(2);

        set2.add(2);
        set2.add(9);
        set2.add(8);

        System.out.println("Conjunto 1");
        System.out.println(set1.transforma_string());

        System.out.println("Conjunto 2");
        System.out.println(set2.transforma_string());

        set1.uniao(set2);
        System.out.println("União");
        System.out.println(set1.transforma_string());

        auxiliar = set1.intersecao(set2);
        System.out.println("Interseção");
        System.out.println(auxiliar.transforma_string());

        auxiliar = set1.diferenca(set2);
        System.out.println("Diferença");
        System.out.println(auxiliar.transforma_string());


    }

}
