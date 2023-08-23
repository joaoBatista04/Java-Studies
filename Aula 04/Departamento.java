import java.util.HashSet;

public class Departamento {
    private String name;
    private int quantidadeDeFuncionarios;
    private HashSet <Funcionario> funcionarios;

    public Departamento(String name){
        this.name = name;
        this.quantidadeDeFuncionarios = 0;
        funcionarios = new HashSet<Funcionario>();
    }

    public HashSet<Funcionario> getFuncionarios() {
        return new HashSet<Funcionario>(funcionarios);
    }

    public void setFuncionarios(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
        quantidadeDeFuncionarios++;
    }

    public void removeFuncionarios(Funcionario f){
        funcionarios.remove(f);
        quantidadeDeFuncionarios--;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getQuantidadeDeFuncionarios() {
        return quantidadeDeFuncionarios;
    }


    public void setQuantidadeDeFuncionarios(int quantidadeDeFuncionarios) {
        this.quantidadeDeFuncionarios = quantidadeDeFuncionarios;
    }

    public double salarioMedioDpto(){
        double salario = 0;

        for(Funcionario f : this.getFuncionarios()){
            salario += f.getSalario();
        }

        salario /= this.getQuantidadeDeFuncionarios();

        return salario;
    }
}
