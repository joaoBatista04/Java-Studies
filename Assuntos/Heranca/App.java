package Assuntos.Heranca;

public class App {
    public static void main(String[] args) {
        Funcionario fulano = new Funcionario("1", "fulano");
        FuncionarioMeioPeriodo sicrano = new FuncionarioMeioPeriodo("2", "sicrano", 6);

        System.out.println(fulano.getName());
        System.out.println(sicrano.getName());
    }
}
