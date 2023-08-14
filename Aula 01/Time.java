public class Time{
    private String nome;
    private int nTitulosMundiais = 0;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNTitulosMundiais() {
        return this.nTitulosMundiais;
    }

    public void setNTitulosMundiais(int nTitulosMundiais) {
        this.nTitulosMundiais = nTitulosMundiais;
    }

    public void incrementaTitulosMundiais(){
        nTitulosMundiais++;
    }
}