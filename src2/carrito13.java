

public class carrito13 {
    private double total;

    public carrito13() {
        this.total = 0.0;
    }

    public void añadirProducto(double precio) {
        this.total += precio;
        System.out.println("Producto añadido: " + precio + ". Total actual: " + total);
    }

    public void aplicarDescuento(double porcentaje) {
        double descuento = total * (porcentaje / 100);
        this.total -= descuento;
        System.out.println("Descuento del " + porcentaje + "% aplicado. Nuevo total: " + total);
    }

    public static void main(String[] args) {
        carrito13 miCarrito = new carrito13();
        miCarrito.añadirProducto(50.0);
        miCarrito.añadirProducto(30.0);
        miCarrito.añadirProducto(20.0);
        miCarrito.aplicarDescuento(10);
    }
}

