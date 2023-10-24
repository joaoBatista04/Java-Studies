//javac ./src/*.java ./src/**/*.java -d bin
//java -cp bin App

import redesocial.RedeSocial;
import redesocial.Usuario;
import rededot.Relatorio;

public class App {
    public static void main(String[] args) throws Exception {
        RedeSocial r = new RedeSocial("Instagram");

        Usuario maria = r.createUsuario("Maria");
        Usuario fulano = r.createUsuario("Fulano");
        Usuario beltrano = r.createUsuario("Beltrano");
        Usuario jorge = r.createUsuario("Jorge");
        Usuario sicrano = r.createUsuario("Sicrano");

        maria.addAmigo(fulano);
        maria.addAmigo(sicrano);
        fulano.addAmigo(maria);
        fulano.addAmigo(sicrano);
        fulano.addAmigo(beltrano);
        jorge.addAmigo(fulano);
        jorge.addAmigo(sicrano);

        //for(Usuario u : r.getUsuarios()){
          //  System.out.println(u.getName());
        //}

        Relatorio relat = new Relatorio();
        System.out.println(relat.geraDot(r));

        Usuario.setPrefix("Mr(s) ");
        System.out.println(relat.geraDot(r));
    }
}