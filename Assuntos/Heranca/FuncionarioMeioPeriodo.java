package Assuntos.Heranca;

public class FuncionarioMeioPeriodo extends Funcionario{
    private int numeroHorasPorDia;

    public FuncionarioMeioPeriodo(String id, String name, int numeroHorasPorDia){
        super(id, name);
        this.numeroHorasPorDia = numeroHorasPorDia;
    }

    public int getNumeroHorasPorDia(){
        return numeroHorasPorDia;
    }
}
