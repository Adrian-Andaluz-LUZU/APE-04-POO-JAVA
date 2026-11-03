public class MainEjercicio4 {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Adrián", 150.0);
        Cuenta c2 = new Cuenta("Mateo", 50.0);

        System.out.println("=== Estado Inicial ===");
        c1.mostrarSaldo();
        c2.mostrarSaldo();
        System.out.println();

        System.out.println("=== Transferencia Válida ===");
        c1.transferir(c2, 50.0);
        c1.mostrarSaldo();
        c2.mostrarSaldo();
        System.out.println();

        System.out.println("=== Transferencia Fallida ===");
        c1.transferir(c2, 200.0); // Transferencia que falla por falta de fondos
        c1.mostrarSaldo();
        c2.mostrarSaldo();
    }
}
