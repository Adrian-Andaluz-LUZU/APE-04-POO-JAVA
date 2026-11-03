public class MainEjercicio3 {
    public static void main(String[] args) {
        Producto p1 = new Producto("Teclado Mecánico", 45.0, 10);

        p1.mostrarProducto();

        Venta v1 = new Venta(3);
        v1.aplicar(p1);

        Venta v2 = new Venta(10); // Intento de compra superior al stock actual
        v2.aplicar(p1);

        p1.mostrarProducto();
    }
}