import biblioteca.*;

public class App {
    public static void main(String[] args) throws Exception{
        Livro l = new biblioteca.Livro("Dom Casmurro");
        System.out.println(l.getTitulo());
    }
}