package semana2_extra;



public class EjercicioDia2 {
    public static void main(String[] args) {
        // 1. Crear luchadores
        Luchador l1 = new Luchador("Goku", 100, 30, 10);
        Luchador l2 = new Luchador("Vegeta", 90, 35, 5);

        System.out.println("--- COMIENZA LA PELEA ---");
        System.out.println(l1.getNombre() + " (HP: " + l1.getVida() + ") VS " + l2.getNombre() + " (HP: " + l2.getVida() + ")");
        System.out.println("-------------------------");

        boolean peleaTerminada = false;

        // Bucle de pelea por turnos
        while (!peleaTerminada) {

            // Turno del Luchador 1 ataca a Luchador 2
            System.out.println("\n> Ataca " + l1.getNombre());
            int danhoL1 = l1.ataca();
            // Verificamos si L2 muere tras recibir el daño
            if (l2.recibeDanho(danhoL1)) {
                System.out.println("\n¡" + l2.getNombre() + " ha sido derrotado!");
                System.out.println("GANADOR: " + l1.getNombre());
                peleaTerminada = true;
                break; // Salimos del bucle
            }

            // Turno del Luchador 2 ataca a Luchador 1
            System.out.println("\n> Ataca " + l2.getNombre());
            int danhoL2 = l2.ataca();
            // Verificamos si L1 muere tras recibir el daño
            if (l1.recibeDanho(danhoL2)) {
                System.out.println("\n¡" + l1.getNombre() + " ha sido derrotado!");
                System.out.println("GANADOR: " + l2.getNombre());
                peleaTerminada = true;
            }
        }
    }
}