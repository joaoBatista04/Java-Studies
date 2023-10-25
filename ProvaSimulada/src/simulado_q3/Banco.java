package simulado_q3;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private String nome;
    private Set<Agencia> agencias = new HashSet<>();

    public Banco(String nome) {
        this.nome=nome;
    }

    public Agencia criaAgencia(String nomeAgencia) {
        Agencia a = new Agencia(nomeAgencia);
        agencias.add(a);
        return a;
    }

    @Override public String toString()
    {
        String result="";
        result+="Nome do Banco: "+this.nome+"\n";
        for(Agencia a : agencias) {
            result+="Agência: "+a.getNomeAgencia()+", saldo médio: "+a.getSaldoMedio()+"\n";
        }
        return result;
    }

}
