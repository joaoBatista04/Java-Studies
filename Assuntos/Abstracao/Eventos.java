package Assuntos.Abstracao;

import java.util.LinkedList;
import java.util.List;

public class Eventos {
    private List<Eventos> eventos = new LinkedList<Eventos>();

    public void addEventos(Eventos e){
        this.eventos.add(e);
    }

    public void removeEventos(Eventos e){
        this.eventos.remove(e);
    }

    public List<Eventos> getEventos(){
        return new LinkedList<Eventos>(this.eventos);
    }
}
