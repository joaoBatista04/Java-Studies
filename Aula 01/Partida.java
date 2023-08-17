public class Partida {
    private int[] placar = new int[2];
    private Time timeA;
    private Time timeB;

    //Construtor que usa parametros
    public Partida(Time timeA, Time timeB){
        this.timeA = timeA;
        this.timeB = timeB;
    }

    //Getters e Setters para os atributos da classe
    public Time getTimeA() {
        return this.timeA;
    }

    public void setTimeA(Time timeA) {
        this.timeA = timeA;
    }

    public Time getTimeB() {
        return this.timeB;
    }

    public void setTimeB(Time timeB) {
        this.timeB = timeB;
    }

    public void incGolTimeA(){
        placar[0]++;
    }

    public void incGolTimeB(){
        placar[1]++;
    }

    public int getGolsTimeA(){
        return placar[0];
    }

    public int getGolsTimeB(){
        return placar[1];
    }

    public void imprimeResultadoPartida(){
        System.out.println("PARTIDA:");
        System.out.println("Time A: " + timeA.getNome());
        System.out.println("Gols Time A: " + this.getGolsTimeA());
        System.out.println("Time B: " + timeB.getNome());
        System.out.println("Gols Time B: " + this.getGolsTimeB() + "\n");
    }
}
