import rededot.Relatorio;
import redesocial.RedeSocial;
import redesocial.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        
        RedeSocial r = new RedeSocial();
        Usuario maria = r.createUsuario("Maria");
        Usuario fulano = r.createUsuario("Fulano");
        Usuario sicrano = r.createUsuario("Sicrano");
        maria.addAmigo(fulano);
        maria.addAmigo(sicrano);
        sicrano.addAmigo(maria);

        System.out.println(Relatorio.geraDot(r));
    }
}
