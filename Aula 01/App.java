public class App{
    public static void main(String[] args) {
        Time fla = new Time();
        fla.setNome("Flamengo");

        Time vasco = new Time();
        vasco.setNome("Vasco");

        Partida flavasco = new Partida();
        flavasco.setTimeA(fla);
        flavasco.setTimeB(vasco);

        flavasco.getTimeA().setNome("Flamengo FC");

        System.out.println("Time A: " + flavasco.getTimeA().getNome());
        System.out.println("Gols do Time A: " + flavasco.getGolsTimeA());
        System.out.println("Time B: " + flavasco.getTimeB().getNome());
        System.out.println("Gols do Time B: " + flavasco.getGolsTimeB());
    }
}