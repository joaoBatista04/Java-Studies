public class Main {
    Partida partida1 = new Partida();

    Cartao cartaoAmarelo1 = new CartaoAmarelo("Jorginho", "Empurrao");
    Gol golcontra = new GolContra("Caca Rato", "Ibis");
    Gol gol = new Gol("Caca Rato", "Ibis");

    partida1.addLances(cartaoAmarelo1);
    partida1.addLances(golcontra);
    partida1.addLances(gol);

    
}
