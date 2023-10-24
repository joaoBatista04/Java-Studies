import java.util.List;

public class App {
    public static void main(String[] args) {
        Time flamengo = new Time("Flamengo", 1);
        Time vasco = new Time("Vasco", 2);

        System.out.println(flamengo.getName());
        System.out.println(flamengo.getTitulos());

        System.out.println(vasco.getName());
        System.out.println(vasco.getTitulos());

        Partida classicoDasMultidoes = new Partida(flamengo, vasco);
        Partida classicoDasMultidoes2 = new Partida(flamengo, vasco);

        classicoDasMultidoes.incTimeDoisGols();
        classicoDasMultidoes.incTimeDoisGols();
        classicoDasMultidoes.incTimeDoisGols();
        classicoDasMultidoes.incTimeUmGols();

        int[] placarDeRetorno = classicoDasMultidoes.retornaPlacar();
        System.out.println(classicoDasMultidoes.getTimeUm().getName() + " " + placarDeRetorno[0] + " x " + placarDeRetorno[1] + " " + classicoDasMultidoes.getTimeDois().getName());

        Campeonato brasileirao = new Campeonato();

        brasileirao.addPartida(classicoDasMultidoes);
        brasileirao.addPartida(classicoDasMultidoes2);
        System.out.println(brasileirao.getPartida(0));
        System.out.println(brasileirao.getPartida(1));
        List<Partida> listaPartidas = brasileirao.getPartidas(); 
        System.out.println(listaPartidas);
    }
}
