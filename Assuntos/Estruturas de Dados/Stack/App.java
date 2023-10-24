public class App {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.addPilha(2);
        pilha.imprimePilha();
        
        pilha.addPilha(2);
        pilha.addPilha(3);
        pilha.addPilha(4);
        pilha.addPilha(5);
        
        pilha.imprimePilha();
        
        pilha.deletePilha();
        pilha.deletePilha();

        pilha.imprimePilha();

        System.out.println(pilha.getSize());
        System.out.println(pilha.isEmpty());

        pilha.deletePilha();
        pilha.deletePilha();
        pilha.deletePilha();

        System.out.println(pilha.getSize());
        System.out.println(pilha.isEmpty());
    }
}
