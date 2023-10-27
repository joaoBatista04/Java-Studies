package Assuntos.Arquivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import java.io.IOException;

public class Arquivo {
    public Arquivo(String caminhoArquivos){
        try (
            FileInputStream fis = new FileInputStream(caminhoArquivos);
            InputStreamReader isr = new InputStreamReader(fis, "ISO-8859-1");
            BufferedReader bf = new BufferedReader(isr);){
                System.out.println(bf.readLine());
        } catch (IOException e) {
            System.out.println("Não foi possível abrir o arquivo!");
        }
    }
}
