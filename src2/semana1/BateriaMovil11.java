package semana1;

public class BateriaMovil11 {
    private int porcentaje;

    public BateriaMovil11(int porcentajeInicial) {
        this.porcentaje = Math.min(100, Math.max(0, porcentajeInicial));
    }

    public void usar(int minutos) {
        // Asumiendo que 1 minuto de juego gasta 1% de batería
        this.porcentaje = Math.max(0, this.porcentaje - minutos);
        System.out.println("Usando móvil... Batería actual: " + porcentaje + "%");
    }

    public void cargar(int minutos) {
        // Asumiendo que 1 minuto de carga recupera 1% de batería
        this.porcentaje = Math.min(100, this.porcentaje + minutos);
        System.out.println("Cargando móvil... Batería actual: " + porcentaje + "%");
    }

    public static void main(String[] args) {
        BateriaMovil11 miMovil = new BateriaMovil11(50);
        System.out.println("Simulando juego (20 min)...");
        miMovil.usar(20);
        System.out.println("Simulando carga (30 min)...");
        miMovil.cargar(30);
    }
}
