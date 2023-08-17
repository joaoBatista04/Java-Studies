public class App{
    public static void main(String[] args) {
        Time flamengo = new Time("CR Flamengo");
        Time vasco = new Time("Vasco da Gama");
        Time botafogo = new Time("Botafogo FC");

        Partida partida1 = new Partida(flamengo, vasco);
        Partida partida2 = new Partida(botafogo, vasco);
        Partida partida3 = new Partida(botafogo, flamengo);

        Campeonato c = new Campeonato();

        partida1.incGolTimeB();
        partida1.incGolTimeB();
        partida1.incGolTimeB();

        partida2.incGolTimeA();
        partida2.incGolTimeB();
        partida2.incGolTimeA();

        partida3.incGolTimeA();
        partida3.incGolTimeA();
        partida3.incGolTimeA();
        partida3.incGolTimeA();
        partida3.incGolTimeA();
        partida3.incGolTimeA();
        partida3.incGolTimeA();
        partida3.incGolTimeB();

        c.adicionarPartida(partida1);
        c.adicionarPartida(partida2);
        c.adicionarPartida(partida3);
        
        for(Partida p : c.getPartidas()){
            p.imprimeResultadoPartida();
        }
    }
}