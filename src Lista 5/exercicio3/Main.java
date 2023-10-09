package exercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main (String[] args)
    {
        int i;
        List<Integer> numeros = new ArrayList<>();
        Random gerar = new Random();

        for(i = 0; i < 50; i++)
        {
            numeros.add(gerar.nextInt(99));
        }

        System.out.print("\n Menor número: " + Collections.min(numeros));
        System.out.print("\n Frequência: " + Collections.frequency(numeros, Collections.min(numeros)));

        Collections.sort(numeros);

        System.out.print("\n Números ordenados: \n");
        for(i = 0; i < 50; i++)
        {
            System.out.println(numeros.get(i));
        }
    }
}