import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new FuncionarioTempoParcial("Jose", 13000, 30);
        //funcionario1.setName("Jose");
        //funcionario1.setSalario(1500.76);

        Funcionario funcionario2 = new FuncionarioTempoParcial("Maria", 1500.78, 20);
        //funcionario2.setName("Maria");
        //funcionario2.setSalario(1500.78);
        
        Departamento dpto1 = new Departamento("RH");
        dpto1.setFuncionarios(funcionario1);

        Departamento dpto2 = new Departamento("Engenharia");
        dpto2.setFuncionarios(funcionario2);

        Empresa empresa = new Empresa("Google");

        empresa.addDepartamento(dpto1);
        empresa.addDepartamento(dpto2);

        empresa.imprimeEmpresa();

        empresa.removeDepartamento(dpto2);
        empresa.imprimeEmpresa();

        dpto1.removeFuncionarios(funcionario1);
        empresa.imprimeEmpresa();

        File arquivo = new File("./data.csv");

        try{
            if(!arquivo.exists()){
                arquivo.createNewFile();
            }

            FileWriter fw = new FileWriter(arquivo);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Texto a ser escrito!");
            bw.newLine();

            bw.close();
            fw.close();
        }

        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
