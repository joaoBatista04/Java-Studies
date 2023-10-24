public abstract class Funcionario {
    private String name;
    private double salario;
    
    public Funcionario(String nome, double salario){
        this.name = nome;
        this.salario = salario;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public abstract double getContribuicaoPrevidenciaria();
}
