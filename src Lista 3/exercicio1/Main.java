package exercicio1;

public class Main {

	  public static void main(String[] args) {

	        Peixe p1 = new Peixe("Lambari");

	        p1.setPeso(0.03);
	        p1.setTipoHabitat("Agua Doce");
	        System.out.println(p1.toString());

	        Cachorro c1 = new Cachorro("Ricardo");

	        c1.setPeso(20);
	        c1.setRaca("Husky Siberiano");
	        System.out.println(c1.toString());
	    }
}
