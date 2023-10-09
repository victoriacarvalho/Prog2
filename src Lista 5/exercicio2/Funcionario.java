package exercicio2;

public class Funcionario {

    private String id, nome, cargo;
    private float salario;

    public  Funcionario(String id, String nome, String cargo, float salario)
    {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\n\tFuncionário" + "\nID: " + id + "\nNome: " + nome + "\nCargo: " + cargo + "\nSalario: R$" + salario;
    }
}

