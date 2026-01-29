package semana2;

public class sem2mascota22 {
    private String nombre;
    private int hambre;

    public sem2mascota22(String nombre, int hambreInicial) {
        this.nombre = nombre;
        this.hambre = Math.max(0, Math.min(100, hambreInicial));
    }

    public void comer() {
        hambre -= 25;
        if (hambre < 0) hambre = 0;
        System.out.println(nombre + " ha comido.");
    }

    public void pasarTiempo() {
        hambre += 5;
        if (hambre > 100) hambre = 100;
        System.out.println("Ha pasado una hora para " + nombre);
    }

    public void mostrarEstado() {
        System.out.println("Mascota: " + nombre + " | Hambre: " + hambre);
    }

    public static void main(String[] args) {
        sem2mascota22 mascota = new sem2mascota22("Luna", 50);

        mascota.mostrarEstado();
        mascota.pasarTiempo();
        mascota.mostrarEstado();
        mascota.comer();
        mascota.mostrarEstado();
        mascota.pasarTiempo();
        mascota.pasarTiempo();
        mascota.mostrarEstado();
    }

}