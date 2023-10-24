import java.util.LinkedList;

public class Queue {
    private LinkedList<Integer> queue = new LinkedList<>();

    public void enqueue(int i){
        queue.addLast(i);
    }

    public void dequeue(){
        queue.removeFirst();
    }

    public int getSize(){
        return queue.size();
    }

    public boolean isEmpty(){
        return this.getSize() == 0;
    }

    public void printQueue(){
        System.out.print("[");

        for(int i : queue){
            System.out.print(i + " ");
        }

        System.out.print("]\n");
    }
}
