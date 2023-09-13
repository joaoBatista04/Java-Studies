package redesocial;

import java.util.Set;
import java.util.HashSet;

public class Usuario {
    private int ID;
    private String name;
    private static String prefix = "Sr(a) ";
    private Set<Usuario> amigos;

    public Usuario(int id, String nome){
        ID = id;
        name = nome;
        this.amigos = new HashSet<>();
    }

    public static void setPrefix(String p){
        prefix = p;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return prefix + name;
    }

    public int getID(){
        return ID;
    }

    public void addAmigo(Usuario amigo){
        amigos.add(amigo);
    }

    public void removeAmigo(Usuario amigo){
        amigos.remove(amigo);
    }

    public HashSet<Usuario> getAmigos(){
        return new HashSet<Usuario>(this.amigos);
    }
}