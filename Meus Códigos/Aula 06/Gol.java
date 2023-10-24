public class Gol extends Lance{
    private String nomeJogadorQueMarcou;
    private String timeBeneficiado;

    public Gol(String nome, String time){
        nomeJogadorQueMarcou = nome;
        timeBeneficiado = time;
    }

    public String getNomeJogadorQueMarcou() {
        return nomeJogadorQueMarcou;
    }

    public String getTimeBeneficiado() {
        return timeBeneficiado;
    }
}
