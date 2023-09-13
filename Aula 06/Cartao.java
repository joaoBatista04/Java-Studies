public abstract class Cartao {
    private String jogador;
    private String motivo;
    
    public Cartao(String jogador, String motivo){
        this.jogador = jogador;
        this.motivo = motivo;
    }

    public String getJogador() {
        return jogador;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
