package exercicio3_b;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Empregado> funcionario = new ArrayList<>();
        SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
        SortName nomes = new SortName();
        DateComparator dataContratacao = new DateComparator();


        try {
            funcionario.add(new Empregado("v1234", "Lucas", 1100, formatData.parse("09/10/2022")));
            funcionario.add(new Empregado("v1235", "Pedro", 3880.50, formatData.parse("07/06/2021")));
            funcionario.add(new Empregado("v1236", "Ana", 1250.90, formatData.parse("20/11/2020")));
            funcionario.add(new Empregado("v1237", "Julia", 2565.78, formatData.parse("28/09/2021")));
            funcionario.add(new Empregado("v1237", "Marcela", 4000, formatData.parse("20/03/2022")));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Collections.sort(funcionario);
        System.out.println("Funcionários por ordem de salário");
        for (Empregado value : funcionario) {
            System.out.println(value);
        }

        System.out.println("---------------------------------------------");
        funcionario.sort(nomes);
        System.out.println("\nFuncionários por ordem alfabética");
        for (Empregado empregado : funcionario) {
            System.out.println(empregado);
        }

        System.out.println("---------------------------------------------");
        System.out.println("\nFuncionário com maior salário: " + Collections.max(funcionario));
        System.out.println("\nFuncionário com menor salário: " + Collections.min(funcionario));
        System.out.println("\nFuncionário mais experiente: " + Collections.min(funcionario, dataContratacao));
        System.out.println("\nFuncionario menos experiente: " + Collections.max(funcionario, dataContratacao));

    }
}
