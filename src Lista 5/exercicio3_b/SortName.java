package exercicio3_b;

import java.util.Comparator;

public class SortName implements Comparator<Empregado> {

    @Override
    public int compare(Empregado o1, Empregado o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
