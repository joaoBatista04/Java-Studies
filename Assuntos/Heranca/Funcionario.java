package Assuntos.Heranca;

public class Funcionario {
    private String id;
    private String name = new String();

    public Funcionario(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
