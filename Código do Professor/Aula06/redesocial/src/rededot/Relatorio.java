package rededot;

import redesocial.RedeSocial;
import redesocial.Usuario;

public class Relatorio {
 
    public static String geraDot(RedeSocial r)
    {
        String result="digraph G {\n";
        for (Usuario u : r.getUsuarios())
        {
            for (Usuario amigo : u.getAmigos()) 
            {
                result+="\""+u.getNome()+"\""+"->"+"\""+amigo.getNome()+"\""+";\n";
            }
        }
        result+="}\n";
        return result;

    }
}
