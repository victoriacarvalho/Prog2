package exercicio2;

public class Main {

	public static void main(String[] args) {

        Cliente p1 = new Cliente("Rita ");

        p1.setIdade(47);
        p1.setSexo("Feminino");
        p1.setValorDivida(240.9);
        p1.setAnoNascim(1975);
        System.out.println(p1.toString());
        
        Vendedor p2 = new Vendedor("Lucas");
        
        p2.setSalario(2300);
        p2.setValorVendas(5000);
        p2.setQntVendas(8);
        System.out.println(p2.toString());
        
        Gerente p3 = new Gerente("Carlos");
        
        p3.setIdade(34);
        p3.setMatricula("19.2.2342");
        p3.setNomeGerencia("Carlos Garcia");
        p3.setSalario(2.900);
        p3.valorInss();
        System.out.println(p3.toString());
       
       
        
    }
}
