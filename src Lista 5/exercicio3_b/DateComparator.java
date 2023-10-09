package exercicio3_b;

import java.util.Comparator;

public class DateComparator implements Comparator <Empregado>
{
    @Override
    public int compare(Empregado o1, Empregado o2) {
        if(o1.getData().before(o2.getData())){
            return -1;
        }
        else if(o1.getData().after(o2.getData())){
            return 1;
        }

        return 0;
    }
}