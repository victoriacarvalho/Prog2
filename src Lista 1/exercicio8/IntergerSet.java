package exercicio8;

public class IntergerSet {

    private boolean[] set;

    public IntergerSet(int size){
        set = new boolean[size];
    }

    public boolean add(int index){
        if(index > set.length - 1 || index < 0){
            return false;
        }
        this.set[index] = true;
        return true;
    }

    public boolean remove(int index){
        if(index > set.length - 1 || index < 0){
            return false;
        }
        this.set[index] = false;
        return true;
    }

    public int size(){
        return set.length;
    }

    public void uniao(IntergerSet input){
        for(int i = 0; i < input.size(); i++){
            if(input.set[i]){
                this.set[i] = true;
            }
        }
    }

    public IntergerSet intersecao(IntergerSet input){
    	IntergerSet output = new IntergerSet(this.size());

        for(int i = 0; i < set.length; i++){
            if(this.set[i] && input.set[i]){
                output.add(i);
            }
        }

        return output;
    }

    public IntergerSet diferenca(IntergerSet input){
    	IntergerSet output = new IntergerSet(this.size());

        for(int i = 0; i < input.size(); i++){
            if(this.set[i] != input.set[i]){
                output.add(i);
            }
        }

        return output;
    }

    public String transforma_string(){
        String number = "";

        for(int i = 0; i < set.length; i++){
            if(set[i]){
                number += " " + i;
            }
        }

        return number + "\n";
    }
}