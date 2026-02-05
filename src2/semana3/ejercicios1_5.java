package semana3;

import java.util.Scanner;

class Alumno {
    private String nombre;
    private double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() { return nombre; }
    public double getNota() { return nota; }

    public void mostrarDatos() {
        System.out.println("Alumno: " + nombre + " | Nota: " + nota);
    }
}

class Jugador {
    private String nombre;
    private int vida;

    public Jugador(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() { return nombre; }
    public int getVida() { return vida; }

    public void recibirDanio(int danio) {
        this.vida -= danio;
        if (this.vida < 0) this.vida = 0;
    }
}

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
}

public class ejercicios1_5 {

    // ejercicio 1
    public static void ejercicio1(Alumno[] lista) {
        System.out.println("--- Ejercicio 1 ---");
        for (int i = 0; i < lista.length; i++) {
            lista[i].mostrarDatos();
        }
    }

    // ejercicio 2
    public static void ejercicio2(Alumno[] lista) {
        System.out.println("\n--- Ejercicio 2 ---");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getNota() >= 5) {
                lista[i].mostrarDatos();
            }
        }
    }

    // ejercicio 3
    public static void ejercicio3(Alumno[] lista) {
        System.out.println("\n--- Ejercicio 3 ---");
        double suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i].getNota();
        }
        System.out.println("Media: " + (suma / lista.length));
    }

    // ejercicio 4
    public static void ejercicio4(Alumno[] lista) {
        System.out.println("\n--- Ejercicio 4 ---");
        Alumno mejor = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i].getNota() > mejor.getNota()) {
                mejor = lista[i];
            }
        }
        System.out.println("Mejor: " + mejor.getNombre());
    }

    // ejercicio 4B
    public static void ejercicio4B(Alumno[] lista) {
        System.out.println("\n--- Ejercicio 4B ---");
        double max = -1;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getNota() > max) max = lista[i].getNota();
        }
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getNota() == max) {
                System.out.println("Top: " + lista[i].getNombre());
            }
        }
    }

    // ejercicio 5
    public static void ejercicio5(Alumno[] lista, Scanner sc) {
        System.out.println("\n--- Ejercicio 5 ---");
        System.out.print("Buscar nombre: ");
        String buscado = sc.next();
        boolean found = false;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getNombre().equalsIgnoreCase(buscado)) {
                System.out.println("Nota: " + lista[i].getNota());
                found = true;
                break;
            }
        }
        if (!found) System.out.println("No encontrado");
    }

    // ejercicio 6
    public static void ejercicio6(Jugador[] lista) {
        System.out.println("\n--- Ejercicio 6 ---");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getVida() > 0) {
                System.out.println(lista[i].getNombre() + " vivo");
            }
        }
    }

    // ejercicio 7
    public static void ejercicio7(Jugador[] lista) {
        System.out.println("\n--- Ejercicio 7 ---");
        int count = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getVida() == 0) count++;
        }
        System.out.println("Muertos: " + count);
    }

    // ejercicio 8
    public static void ejercicio8(Jugador[] lista) {
        System.out.println("\n--- Ejercicio 8 ---");
        for (int i = 0; i < lista.length; i++) {
            lista[i].recibirDanio(10);
            System.out.println(lista[i].getNombre() + " Vida: " + lista[i].getVida());
        }
    }

    // ejercicio 9
    public static void ejercicio9(Producto[] lista, Scanner sc) {
        System.out.println("\n--- Ejercicio 9 ---");
        System.out.print("Precio min: ");
        double min = sc.nextDouble();
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getPrecio() > min) {
                System.out.println(lista[i].getNombre());
            }
        }
    }

    // ejercicio 10
    public static void ejercicio10(Producto[] lista) {
        System.out.println("\n--- Ejercicio 10 ---");
        Producto caro = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i].getPrecio() > caro.getPrecio()) {
                caro = lista[i];
            }
        }
        System.out.println("Mas caro: " + caro.getNombre());
    }
}