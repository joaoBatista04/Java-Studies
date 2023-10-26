package src.campeonato;

import src.lance.Gol;
import src.lance.Lance;

import java.util.LinkedList;
import java.util.List;

public class Partida {
    private String timeA;
    private String timeB;
    private List<Lance> lances = new LinkedList<Lance>();

    public Partida(String timeA, String timeB){
        this.timeA = timeA;
        this.timeB = timeB;
    }

    public void addLance(Lance l){
        this.lances.add(l);
    }

    public List<Lance> getLances(){
        return new LinkedList<Lance>(this.lances);
    }

    public String getTimeA(){
        return this.timeA;
    }

    public String getTimeB(){
        return this.timeB;
    }

    public List<Gol> getGolsDaPartida(){
        List<Gol> gols = new LinkedList<Gol>();

        for(Lance l : lances){
            if(l instanceof Gol){
                gols.add((Gol)l);
            }
        }

        return gols;
    }

    public boolean temGolContra(){
        boolean isGolContra = false;

        for(Gol g : this.getGolsDaPartida()){
            if(g.getIsGoalContra()){
                isGolContra = true;
                break;
            }
        }

        return isGolContra;
    }
}
