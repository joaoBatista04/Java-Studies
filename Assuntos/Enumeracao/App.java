package Assuntos.Enumeracao;

enum DayOfWeek{
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}

public class App {
    public static void main(String[] args) {
        DayOfWeek days[] = DayOfWeek.values();

        for(DayOfWeek day : days){
            System.out.println(day);
        }

        System.out.println(DayOfWeek.valueOf("SEGUNDA"));
    }
}
