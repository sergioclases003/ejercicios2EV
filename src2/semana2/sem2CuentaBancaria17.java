package semana2;

public class sem2CuentaBancaria17 {
    private String titular;
    private double saldo;

    public sem2CuentaBancaria17(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Ingresados " + cantidad + " euros.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Error: No hay suficiente dinero. " + cantidad + " euro");
        } else {
            saldo -= cantidad;
            System.out.println("Retirados " + cantidad + " euros.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Titular: " + titular + " | Saldo: " + saldo + " euros.");
    }

    public static void main(String[] args) {

        // Crear una cuenta bancaria
        sem2CuentaBancaria17 cuenta = new sem2CuentaBancaria17("Juan Pérez", 1000);

        // Usar los métodos
        cuenta.mostrarEstado();
        cuenta.ingresar(200);
        cuenta.retirar(150);
        cuenta.mostrarEstado();
    }
}