package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 850.0, 8);
        Producto p2 = new Producto("Mouse", 20.0, 15);
        Producto p3 = new Producto("Teclado", 45.0, 6);
        Producto p4 = new Producto("Monitor", 200.0, 4);

        Producto[] productos = {p1, p2, p3, p4};

        System.out.println("--- Inventario Inicial ---");
        for (Producto p : productos) {
            System.out.println(p.nombre + ": $" + p.precio);
        }

        // Simular venta de 3 unidades de dos de ellos (Laptop y Monitor)
        p1.stock -= 3;
        p4.stock -= 3;

        System.out.println("\n--- Inventario Tras Ventas y Stock ---");
        double valorTotal = 0;
        for (Producto p : productos) {
            String reponer = (p.stock < 5) ? " -> Reponer" : "";
            System.out.println(p.nombre + ": Precio $" + p.precio + " | Stock: " + p.stock + reponer);
            valorTotal += (p.precio * p.stock);
        }

        System.out.println("\nValor total del inventario: $" + valorTotal);
    }
}
