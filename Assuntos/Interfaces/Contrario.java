package Assuntos.Interfaces;

public class Contrario implements Forma{
    @Override
    public void desenhar(){
        System.out.println("Nao desenhando!");
    }

    @Override
    public void inverter(){
        System.out.println("Nao invertendo!");
    }
}
