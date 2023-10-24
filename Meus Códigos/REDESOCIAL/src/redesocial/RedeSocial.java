package redesocial;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import redesocial.Usuario;

public class RedeSocial{
    private String name;
    private Map<Integer, Usuario> usuarios;

    private int idAtual;

    public RedeSocial(String name){
        this.name = name;
        this.usuarios = new HashMap<>();
        this.idAtual = 0;
    }

    public String getName(){
        return this.name;
    }

    public Usuario createUsuario(String name){
        Usuario user = new Usuario(idAtual, name);
        this.addUsuario(user);
        
        idAtual++;

        return user;
    }

    public void addUsuario(Usuario u){
        usuarios.put(u.getID(), u);
    }

    public Set<Usuario> getUsuarios(){
        return new HashSet<Usuario>(this.usuarios.values());
    }

    public void removeUsuario(int id){
        usuarios.remove(id);
    }
}