package simulado_q3;

import java.util.HashSet;
import java.util.Set;

public class Agencia {

    private String nomeAgencia;
    private Set<Conta> contas = new HashSet<>();

    public Agencia(String nomeAgencia) {
        this.nomeAgencia=nomeAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public void adicionaConta(Conta conta) {
        contas.add(conta);
    }

    public double getSaldoMedio() {
        if (contas.isEmpty()) return 0.0;
        double somaSaldo=0.0;
        for (Conta c : contas)
        {
            somaSaldo+=c.getSaldoInicial();
        }
        return somaSaldo/contas.size();
    }

}
