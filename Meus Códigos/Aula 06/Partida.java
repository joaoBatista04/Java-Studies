import java.util.LinkedList;

public class Partida{
    private LinkedList<Lance> lances;

    public Partida(){
        this.lances = new LinkedList<Lance>();
    }

    public void addLances(Lance lance){
        this.lances.add(lance);
    }

    public LinkedList<Lance> getLances(){
        LinkedList<Lance> lanceCopy = new LinkedList<>(lances);

        return lanceCopy;
    }
}
