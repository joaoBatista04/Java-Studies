import java.util.Set;
import java.util.HashSet;

public class Empresa{
    private String name;
    private Set<Departamento> departamentos = new HashSet<Departamento>();
    private int quantidadeDeDepartamentos;

    public Empresa(String name){
        this.name = name;
        quantidadeDeDepartamentos = 0;
    }

    public void addDepartamento(Departamento dpto){
        departamentos.add(dpto);
        quantidadeDeDepartamentos++;
    }

    public void removeDepartamento(Departamento d){
        departamentos.remove(d);
        quantidadeDeDepartamentos--;
    }

    public Set<Departamento> getDepartamentos(){
        return new HashSet<Departamento>(departamentos);
    } 

    public String getName(){
        return name;
    }

    public double salarioMedioEmpresa(){
        double salario = 0;

        for(Departamento d : this.getDepartamentos()){
            salario += d.salarioMedioDpto();
        }

        salario /= this.quantidadeDeDepartamentos;

        return salario;
    }

    public void imprimeEmpresa(){
        double salarioMedio;

        if(!Double.isNaN(this.salarioMedioEmpresa())){
            salarioMedio = this.salarioMedioEmpresa();
        } else{
            salarioMedio = 0.00;
        }

        System.out.println(this.getName() + " - Salario Medio da Empresa: R$" + salarioMedio + "\nDepartamentos:");

        for(Departamento dptoAtual : this.getDepartamentos()){
            if(!Double.isNaN(dptoAtual.salarioMedioDpto())){
                salarioMedio = dptoAtual.salarioMedioDpto();
            } else{
                salarioMedio = 0.00;
            }
            
            System.out.println("Nome: " + dptoAtual.getName() + " - Qntd. Funcionários: " + dptoAtual.getQuantidadeDeFuncionarios() + " - Salario Medio do Departamento: R$" + salarioMedio);
            
            for(Funcionario f : dptoAtual.getFuncionarios()){
                System.out.println("\tNome Func: " + f.getName() + " - Salario: R$" + f.getSalario());
            }
        }

        System.out.println("\n");
    }
}