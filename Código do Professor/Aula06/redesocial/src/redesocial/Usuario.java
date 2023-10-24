package redesocial;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private int id;
    private String nome;
    private static String prefix="Sr(a)";
    private Set<Usuario> amigos = new HashSet<>();
    
    public Usuario(int id, String nome)
    {
        this.id=id;
        this.nome=nome;
    }

    public static void setPrefix(String p)
    {
        prefix=p;
    }

    public int getId(){
        return this.id;
    }

    public void setNome(String nome)
    {
        this.nome=nome;
    }
    
    public String getNome()
    {
        return prefix+this.nome;
    }

    public void addAmigo(Usuario amigo)
    {
        amigos.add(amigo);
    }

    public void removeAmigo(Usuario amigo)
    {
        amigos.remove(amigo);
    }

    public Set<Usuario> getAmigos()
    {
        return new HashSet<Usuario>(this.amigos);
    }
}
