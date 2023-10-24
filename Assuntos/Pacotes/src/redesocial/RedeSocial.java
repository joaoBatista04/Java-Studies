package Assuntos.Pacotes.src.redesocial;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RedeSocial {
    private Map<Integer,Usuario> usuarios = new HashMap<>();
    
    private int idAtual;

    public Usuario createUsuario(String nome)
    {
        Usuario u = new Usuario(idAtual,nome);
        idAtual++;
        this.addUsuario(u);
        return u;
    }

    public Set<Usuario> getUsuarios()
    {
        return new HashSet<Usuario>(this.usuarios.values());
    }

    private void addUsuario(Usuario u)
    {
        usuarios.put(u.getId(), u);
    }

    public void removeUsuario(int id)
    {
        usuarios.remove(id);
    }

    public void removeUsuario(Usuario u)
    {
        usuarios.remove(u.getId());
    }
}