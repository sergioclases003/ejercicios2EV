package semana1;

public class EntradasCine16 {
    private String nombrePelicula;
    private double precioBase;
    private boolean esEstudiante;

    public EntradasCine16(String nombrePelicula, double precioBase, boolean esEstudiante) {
        this.nombrePelicula = nombrePelicula;
        this.precioBase = precioBase;
        this.esEstudiante = esEstudiante;
    }

    public double precioFinal() {
        if (esEstudiante) {
            return precioBase * 0.8; // 20% de descuento
        }
        return precioBase;
    }

    public static void main(String[] args) {
        EntradasCine16 e1 = new EntradasCine16("Inception", 10.0, true);
        EntradasCine16 e2 = new EntradasCine16("Inception", 10.0, false);

        System.out.println("Pelicula: " + e1.nombrePelicula);
        System.out.println("Precio estudiante: " + e1.precioFinal());
        System.out.println("Precio normal: " + e2.precioFinal());
    }
}
