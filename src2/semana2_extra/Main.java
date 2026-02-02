package semana2_extra;


public class Main {
    public static void main(String[] args) {
        Luchador goku = new Luchador("Goku", 50, 30, 5);
        Luchador vegeta = new Luchador("Vegeta", 40, 25, 5);

        System.out.println("> Ataca Vegeta");
        goku.recibeDanho(vegeta.ataca());

        System.out.println("> Ataca Goku");
        vegeta.recibeDanho(goku.ataca());
    }
}
