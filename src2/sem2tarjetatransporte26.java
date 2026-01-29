public class sem2tarjetatransporte26 {
    private double saldo;

    public sem2tarjetatransporte26(double saldoInicial) {
        this.saldo = Math.max(0, saldoInicial);
    }

    public void recargar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Recargados " + cantidad + " euros.");
        }
    }

    public void pagarViaje(double coste) {
        if (saldo >= coste) {
            saldo -= coste;
            System.out.println("Viaje pagado: " + coste + " euros.");
        } else {
            System.out.println("Error: Saldo insuficiente para pagar el viaje de " + coste + " euros.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo tarjeta: " + saldo + " euros.");
    }

    public static void main(String[] args) {
        sem2tarjetatransporte26 tarjeta = new sem2tarjetatransporte26(5.00);

        tarjeta.mostrarSaldo();
        tarjeta.pagarViaje(1.50);
        tarjeta.mostrarSaldo();
        tarjeta.pagarViaje(4.00); // saldo insuficiente
        tarjeta.recargar(10.00);
        tarjeta.mostrarSaldo();
        tarjeta.pagarViaje(2.30);
        tarjeta.mostrarSaldo();
    }

}
