package src.lance;

public class Gol extends Lance{
    private boolean isGoalContra;

    public Gol(int minutoDoJogo, boolean isGoalContra){
        super(minutoDoJogo);
        this.isGoalContra = isGoalContra;
    }

    public boolean getIsGoalContra(){
        return this.isGoalContra;
    }
}
