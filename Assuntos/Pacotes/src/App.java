import Assuntos.Pacotes.src.redesocial.RedeSocial;
import Assuntos.Pacotes.src.redesocial.Usuario;

public class App {
    public static void main(String[] args) {
        RedeSocial r = new RedeSocial();
        Usuario maria = r.createUsuario("Maria");
        Usuario fulano = r.createUsuario("Fulano");
        Usuario sicrano = r.createUsuario("Sicrano");
        maria.addAmigo(fulano);
        maria.addAmigo(sicrano);
        sicrano.addAmigo(maria);

        System.out.println("Deu certo!");
    }
}
