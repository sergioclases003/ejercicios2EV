public class sem2Contador19 {
    private int valor;

    public sem2Contador19(int valorInicial) {
        this.valor = Math.max(0, valorInicial);
    }

    public void incrementar() {
        valor++;
    }

    public void decrementar() {
        if (valor > 0) {
            valor--;
        } else {
            System.out.println("Error: El contador no puede ser negativo.");
        }
    }

    public void reiniciar() {
        valor = 0;
    }

    public void mostrarValor() {
        System.out.println("Valor del contador: " + valor);
    }

    // MAIN
    public static void main(String[] args) {
        sem2Contador19 contador = new sem2Contador19(5);

        contador.mostrarValor();
        contador.incrementar();
        contador.incrementar();
        contador.mostrarValor();
        contador.decrementar();
        contador.mostrarValor();
        contador.reiniciar();
        contador.mostrarValor();
    }
}
