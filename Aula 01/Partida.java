public class Partida {
    private int nGolsA, nGolsB;
    private Time timeA;
    private Time timeB;

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
        nGolsA++;
    }

    public void incGolTimeB(){
        nGolsB++;
    }

    public int getGolsTimeA(){
        return nGolsA;
    }

    public int getGolsTimeB(){
        return nGolsB;
    }
}
