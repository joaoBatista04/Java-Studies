public class App {
    public static void main(String[] args) {
        Time flamengo = new Time("Flamengo", 1);
        Time vasco = new Time("Vasco", 2);

        System.out.println(flamengo.getName());
        System.out.println(flamengo.getTitulos());

        System.out.println(vasco.getName());
        System.out.println(vasco.getTitulos());

        Partida classicoDasMultidoes = new Partida(flamengo, vasco);

        classicoDasMultidoes.incTimeDoisGols();
        classicoDasMultidoes.incTimeDoisGols();
        classicoDasMultidoes.incTimeDoisGols();
        classicoDasMultidoes.incTimeUmGols();

        int[] placarDeRetorno = classicoDasMultidoes.retornaPlacar();
        System.out.println(classicoDasMultidoes.getTimeUm().getName() + " " + placarDeRetorno[0] + " x " + placarDeRetorno[1] + " " + classicoDasMultidoes.getTimeDois().getName());
    }
}
