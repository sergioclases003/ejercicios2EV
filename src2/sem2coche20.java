public class sem2coche20 {
    private String marca;
    private double velocidad;
    private double velocidadMaxima;

    public sem2coche20(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidad = 0;
    }

    public void acelerar(double incremento) {
        velocidad += incremento;
        if (velocidad > velocidadMaxima) {
            velocidad = velocidadMaxima;
            System.out.println("Alcanzada velocidad máxima.");
        }
    }

    public void frenar(double decremento) {
        velocidad -= decremento;
        if (velocidad < 0) {
            velocidad = 0;
        }
    }

    public void mostrarVelocidad() {
        System.out.println("Coche " + marca + " | Velocidad actual: " + velocidad + " km/h");
    }

    public static void main(String[] args) {
        sem2coche20 coche = new sem2coche20("Toyota", 180);

        coche.mostrarVelocidad();
        coche.acelerar(50);
        coche.mostrarVelocidad();
        coche.acelerar(200); // supera la velocidad máxima
        coche.mostrarVelocidad();
        coche.frenar(70);
        coche.mostrarVelocidad();
    }

}