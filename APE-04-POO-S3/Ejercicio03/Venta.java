public class Venta {
    int cantidad;

    public Venta(int cantidad) {
        this.cantidad = cantidad;
    }

    public void aplicar(Producto producto) { // Objeto recibido como parámetro[cite: 22]
        if (producto.reducirStock(cantidad)) {
            double total = cantidad * producto.precio;
            System.out.println("Venta realizada: " + cantidad + " unidades de " + producto.nombre);
            System.out.println("Total a pagar: $" + total);
        } else {
            System.out.println("No se pudo completar la venta.");
        }
        System.out.println("----------------------------");
    }
}
