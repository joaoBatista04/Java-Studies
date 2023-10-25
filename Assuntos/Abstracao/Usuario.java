package Assuntos.Abstracao;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private String id = new String();
    private Set<Usuario> amigos = new HashSet<Usuario>();

    public Usuario(String id){
        this.id = id;
    }

    public String getName(){
        return this.id;
    }

    public void addAmigo(Usuario u){
        this.amigos.add(u);
    }

    public void removeAmigo(Usuario u){
        this.amigos.remove(u);
    }

    public Set<Usuario> getAmigos(){
        return new HashSet<Usuario>(this.amigos);
    }
}
