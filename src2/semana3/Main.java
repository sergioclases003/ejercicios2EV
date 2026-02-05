package semana3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // datos de prueba para el ej de alumnos
        Alumno[] alumnos = new Alumno[5];
        alumnos[0] = new Alumno("Pepe", 4.5);
        alumnos[1] = new Alumno("Ana", 9.0);
        alumnos[2] = new Alumno("Luis", 5.0);
        alumnos[3] = new Alumno("Marta", 9.0);
        alumnos[4] = new Alumno("Carlos", 3.0);

        ejercicios1_5.ejercicio1(alumnos);
        ejercicios1_5.ejercicio2(alumnos);
        ejercicios1_5.ejercicio3(alumnos);
        ejercicios1_5.ejercicio4(alumnos);
        ejercicios1_5.ejercicio4B(alumnos);
        ejercicios1_5.ejercicio5(alumnos, sc);

        Jugador[] jugadores = new Jugador[4];
        jugadores[0] = new Jugador("Guerrero", 100);
        jugadores[1] = new Jugador("Mago", 0);
        jugadores[2] = new Jugador("Arquero", 50);
        jugadores[3] = new Jugador("Aldeano", 0);

        ejercicios1_5.ejercicio6(jugadores);
        ejercicios1_5.ejercicio7(jugadores);
        ejercicios1_5.ejercicio8(jugadores);

        //datos de prueba para probar producto
        Producto[] productos = new Producto[4];
        productos[0] = new Producto("TV", 300);
        productos[1] = new Producto("Cable", 10);
        productos[2] = new Producto("PC", 1200);
        productos[3] = new Producto("Raton", 25);

        ejercicios1_5.ejercicio9(productos, sc);
        ejercicios1_5.ejercicio10(productos);

        sc.close();
    }
}