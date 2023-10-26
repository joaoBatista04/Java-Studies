package src.campeonato;

import java.util.LinkedList;
import java.util.List;

import src.lance.Gol;
import src.lance.Lance;

public class Campeonato {
    private List<Partida> partidas = new LinkedList<Partida>();

    public void addPartida(Partida p){
        this.partidas.add(p);
    }

    public List<Partida> getPartidas(){
        return new LinkedList<Partida>(this.partidas);
    }

    public void printPartidaComMaisGols(){
        int qntdGols = 0;
        int maiorQuantidade = 0;
        Partida pcmg = new Partida(null, null);
        
        for(Partida p : this.partidas){
            for(Lance l : p.getLances()){
                if(l instanceof Gol){
                    qntdGols++;
                }
            }

            if(qntdGols >= maiorQuantidade){
                maiorQuantidade = qntdGols;
                pcmg = p;
            }

            qntdGols = 0;
        }

        System.out.println("A partida com mais quantidade de gols é: " + pcmg.getTimeA() + " x " + pcmg.getTimeB() + " (Número de gols: " + maiorQuantidade + ")");
    }

    public void printPartidasComGolContra(){
        System.out.println("Partidas com gol contra:");

        for(Partida p : partidas){
            if(p.temGolContra()){
                System.out.println(p.getTimeA() + " x " + p.getTimeB());
            }
        }
    }
}
