public class FuncionarioTempoParcial extends Funcionario{
    private int nHorasSemanais;

    public FuncionarioTempoParcial(String nome, double salario, int nHorasSemanais){
        super(nome, salario);
        this.nHorasSemanais = nHorasSemanais;
    }

    public void setNumeroHorasSemanais(int nHorasSemanais){
        this.nHorasSemanais = nHorasSemanais;
    }

    public int getNumeroHorasSemanais(){
        return this.nHorasSemanais;
    }

    @Override
    public double getContribuicaoPrevidenciaria(){
        return 0.10f * getSalario();
    }
}
