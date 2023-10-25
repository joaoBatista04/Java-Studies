package Assuntos.Interfaces;

public class UmaForma implements Forma{
    @Override
    public void desenhar(){
        System.out.println("Desenhando!");
    }

    @Override
    public void inverter(){
        System.out.println("Invertendo!");
    }
}
