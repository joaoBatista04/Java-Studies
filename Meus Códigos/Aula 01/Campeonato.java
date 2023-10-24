import java.util.LinkedList;

public class Campeonato{
    private LinkedList<Partida> partidas = new LinkedList<Partida>();

    public LinkedList<Partida> getPartidas() {
        return new LinkedList<Partida>(partidas);
    }

    public void adicionarPartida(Partida p){
        partidas.addLast(p);
    }
}