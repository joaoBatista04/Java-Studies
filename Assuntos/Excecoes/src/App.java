package Assuntos.Excecoes.src;

import Assuntos.Excecoes.src.redesocial.IdentificadorInvalido;
import Assuntos.Excecoes.src.redesocial.Usuario;
import Assuntos.Excecoes.src.redesocial.RedeSocial;

public class App {
    public static void main(String[] args) {
        RedeSocial twitter = new RedeSocial();

        Usuario sicrano = twitter.criaUsuario("Sicrano");
        Usuario fulano = twitter.criaUsuario("Fulano");
        Usuario maria = twitter.criaUsuario("Maria");

        sicrano.addAmigo(fulano);
        sicrano.addAmigo(maria);
        maria.addAmigo(fulano);

        try {
            Usuario u = twitter.getUsuario(1);
            System.out.println(u.getNome());
        } catch (IdentificadorInvalido e) {
            System.out.println(e.getMessage());
        }
    }
}
