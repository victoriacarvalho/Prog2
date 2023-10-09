package exercicio3_b;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Empregado implements Comparable<Empregado>{

    private String ID, nome;
    private double salario;
    private Date data;

    public Empregado(String ID, String nome, double salario, Date data) {
        this.ID = ID;
        this.nome = nome;
        this.salario = salario;
        this.data = data;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString(){
        SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
        return "\n\tFuncionário" + "\nID: " + ID + "\nNome: " + nome + "\nSalario: R$" + salario +
                "\nData: " + formatData.format(data);
    }

    @Override
    public int compareTo(Empregado o) {
        if(this.getSalario() == o.getSalario()){
            return 0;
        }
        if(this.getSalario() < o.getSalario()){
            return -1;
        }

        return 1;
    }
}