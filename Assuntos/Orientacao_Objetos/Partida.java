public class Partida {
    private int[] placar = new int[2];
    private Time time1;
    private Time time2;

    public Partida(Time time1, Time time2){
        this.time1 = time1;
        this.time2 = time2;

        this.placar[0] = 0;
        this.placar[1] = 0;
    }

    public void incTimeUmGols(){
        placar[0]++;
    }

    public void incTimeDoisGols(){
        placar[1]++;
    }

    public int[] retornaPlacar(){
        int[] placarRetorno = new int[2];

        placarRetorno[0] = placar[0];
        placarRetorno[1] = placar[1];

        return placarRetorno;
    }

    public Time getTimeUm(){
        return time1;
    }

    public Time getTimeDois(){
        return time2;
    }
}
