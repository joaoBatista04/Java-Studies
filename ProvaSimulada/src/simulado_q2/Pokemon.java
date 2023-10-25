package simulado_q2;

import java.util.Random;

public class Pokemon implements PersonagemDeLuta<Pokemon> {

    private int vitalidadeInicial, danoBaixo, danoAlto,
    vitalidade;

    public Pokemon(int vitalidadeInicial, int danoBaixo,
     int danoAlto)
     {
        this.vitalidadeInicial=vitalidadeInicial;
        this.danoBaixo=danoBaixo;
        this.danoAlto=danoAlto;
        this.vitalidade=vitalidadeInicial;
     }

    @Override
    public boolean atacar(Pokemon personagemAtacado) {
        // sortear
        Random r = new Random();
        int danosAtaque = r.nextBoolean()? danoBaixo : danoAlto;
        // atacar diminuindo pontos do pokemon atacado
        personagemAtacado.vitalidade=personagemAtacado.vitalidade-danosAtaque;
        if (personagemAtacado.vitalidade<=0) 
        {
            personagemAtacado.vitalidade=0;
            return true;
        }
        else return false;
    }

    @Override
    public void regenera() {
        vitalidade=vitalidadeInicial;
    }

    @Override
    public int getPontosVitalidade() {
        return vitalidade;
    }

 
}
