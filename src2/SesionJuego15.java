public class SesionJuego15 {
    private String nombreJuego;
    private int minutosJugados;

    public SesionJuego15(String nombreJuego) {
        this.nombreJuego = nombreJuego;
        this.minutosJugados = 0;
    }

    public void jugar(int minutos) {
        this.minutosJugados += minutos;
        System.out.println("Jugando " + minutos + " min a " + nombreJuego);
    }

    public double horasJugadas() {
        return minutosJugados / 60.0;
    }

    public static void main(String[] args) {
        SesionJuego15 sesion = new SesionJuego15("Minecraft");
        sesion.jugar(45);
        sesion.jugar(30);
        sesion.jugar(15);
        System.out.printf("Horas totales jugadas: %.2f horas\n", sesion.horasJugadas());
    }
}
