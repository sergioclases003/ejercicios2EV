package semana2_extra;

import java.util.Random;



public class EjercicioDia3 {
    public static void main(String[] args) {
        Random rand = new Random();

        // 1. Crear array de 10 luchadores
        Luchador[] luchadores = new Luchador[10];

        // Inicialización con valores aleatorios
        for (int i = 0; i < luchadores.length; i++) {
            // Generar stats aleatorios
            // Fórmula Random: min + random.nextInt(max - min + 1)
            int vida = 80 + rand.nextInt(41);   // 80 a 120
            int ataque = 10 + rand.nextInt(11); // 10 a 20
            int defensa = 5 + rand.nextInt(6);  // 5 a 10

            luchadores[i] = new Luchador("Luchador " + (i + 1), vida, ataque, defensa);
        }

        int luchadoresVivos = luchadores.length;

        System.out.println("--- BATTLE ROYALE DE 10 LUCHADORES ---");

        // Bucle principal: mientra haya más de 1 vivo, siguen peleando
        while (luchadoresVivos > 1) {

            // Seleccionar 2 índices aleatorios distintos
            int indice1 = rand.nextInt(10);
            int indice2 = rand.nextInt(10);

            // Asegurarnos que no sean el mismo y que ambos estén vivos
            while (indice1 == indice2 || luchadores[indice1].getVida() <= 0 || luchadores[indice2].getVida() <= 0) {
                indice1 = rand.nextInt(10);
                indice2 = rand.nextInt(10);
            }

            Luchador p1 = luchadores[indice1];
            Luchador p2 = luchadores[indice2];

            System.out.println("\n*** NUEVO ENFRENTAMIENTO ***");
            System.out.println(p1.getNombre() + " (HP: " + p1.getVida() + ") vs " + p2.getNombre() + " (HP: " + p2.getVida() + ")");

            // Simular pelea a muerte entre estos dos seleccionados
            boolean alguienMurio = false;
            while (!alguienMurio) {
                // P1 ataca a P2
                if (p2.recibeDanho(p1.ataca())) {
                    System.out.println("--> " + p2.getNombre() + " ha caído.");
                    luchadoresVivos--; // Restamos contador
                    alguienMurio = true;
                } else {
                    // Si P2 sigue vivo, contraataca a P1
                    if (p1.recibeDanho(p2.ataca())) {
                        System.out.println("--> " + p1.getNombre() + " ha caído.");
                        luchadoresVivos--; // Restamos contador
                        alguienMurio = true;
                    }
                }
            }

            System.out.println("Luchadores restantes: " + luchadoresVivos);
        }

        // Encontrar al ganador
        for (Luchador l : luchadores) {
            if (l.getVida() > 0) {
                System.out.println("\n=================================");
                System.out.println("EL GANADOR DEL TORNEO ES: " + l.getNombre());
                System.out.println("Vida restante: " + l.getVida());
                System.out.println("=================================");
            }
        }
    }
}
