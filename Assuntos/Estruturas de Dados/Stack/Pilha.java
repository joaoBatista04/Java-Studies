import java.util.LinkedList;

public class Pilha {
    private LinkedList<Integer> pilha = new LinkedList<>();

    public void addPilha(int i){
        pilha.addFirst(i);
    }

    public void deletePilha(){
        pilha.removeFirst();
    }

    public int getSize(){
        return pilha.size();
    }

    public boolean isEmpty(){
        return this.getSize() == 0;
    }

    public void imprimePilha(){
        System.out.print("[");

        for(int i : pilha){
            System.out.print(i + " ");
        }

        System.out.print("]\n");
    }
}
