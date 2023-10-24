package Assuntos.Pacotes.src.redesocial;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private int id;
    private String nome;
    private static String prefix="Sr(a)";
    private Set<Usuario> amigos = new HashSet<>();

    public Usuario(int id, String nome){
        this.nome = nome;
        this.id = id;
    }

    public static void setPrefix(String p){
        prefix=p;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addAmigo(Usuario amigo){
        this.amigos.add(amigo);
    }

    public void removeAmigo(Usuario amigo){
        this.amigos.remove(amigo);
    }

    public Set<Usuario> getAmigos(){
        return new HashSet<Usuario>(this.amigos);
    }
}
