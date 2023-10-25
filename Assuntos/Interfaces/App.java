package Assuntos.Interfaces;

public class App {
    public static void main(String[] args) {
        Contrario contrario = new Contrario();
        UmaForma umaForma = new UmaForma();

        contrario.desenhar();
        contrario.inverter();

        umaForma.desenhar();
        umaForma.inverter();
    }
}
