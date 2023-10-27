import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("a.txt");
            InputStreamReader reader = new InputStreamReader(fin,"ISO-8859-1");
            BufferedReader br = new BufferedReader(reader);) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo a.txt");
        }

    }
}
