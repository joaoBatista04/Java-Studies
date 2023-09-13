package rededot;

import redesocial.RedeSocial;
import redesocial.Usuario;

public class Relatorio{
    public String geraDot(RedeSocial r){
        String result = "digraph G {\n";

        for(Usuario u : r.getUsuarios()){
            for(Usuario amigo : u.getAmigos()){
                result += u.getName() + "->" + amigo.getName() + "\n";
            }
        }

        result += "}\n";
        return result;
    }
}