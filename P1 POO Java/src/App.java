package src;

import src.campeonato.Campeonato;
import src.campeonato.Partida;
import src.lance.Falta;
import src.lance.Gol;
import src.lance.Lance;

public class App {
    public static void main(String[] args) {
        Campeonato brasileirao = new Campeonato();

        Partida flavasco = new Partida("Flamengo", "Vasco");
        Partida derbyPaulista = new Partida("Corinthians", "Palmeiras");

        Lance faltaFlamengo = new Falta(54);
        Lance golContraFlamengo = new Gol(32, true);
        Lance golCorinthians = new Gol(37, false);
        Lance golContraPalmeiras = new Gol(44, true);

        flavasco.addLance(faltaFlamengo);
        flavasco.addLance(golContraFlamengo);

        derbyPaulista.addLance(golCorinthians);
        derbyPaulista.addLance(golContraPalmeiras);

        brasileirao.addPartida(flavasco);
        brasileirao.addPartida(derbyPaulista);

        brasileirao.printPartidaComMaisGols();
        brasileirao.printPartidasComGolContra();
    }
}
