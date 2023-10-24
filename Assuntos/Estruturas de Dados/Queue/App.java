public class App {
    public static void main(String[] args) {
        Queue fila = new Queue();

        fila.enqueue(2);
        fila.printQueue();

        fila.enqueue(3);
        fila.enqueue(4);
        fila.enqueue(5);

        fila.printQueue();

        fila.dequeue();
        fila.dequeue();

        fila.printQueue();
        System.out.println(fila.getSize());
        System.out.println(fila.isEmpty());

        fila.dequeue();
        fila.dequeue();

        fila.printQueue();
        System.out.println(fila.getSize());
        System.out.println(fila.isEmpty());
    }
}
