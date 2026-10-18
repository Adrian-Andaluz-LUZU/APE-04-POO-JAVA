package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Carlos", 200.0);
        Cuenta c2 = new Cuenta("Lucia", 350.0);

        int mesesC1 = 0;
        int mesesC2 = 0;

        System.out.println("--- Simulación Cuenta 1 (" + c1.titular + ") ---");
        while (c1.saldo < 500) {
            c1.saldo += 50;
            mesesC1++;
            System.out.println(c1.titular + " : " + c1.saldo);
        }

        System.out.println("\n--- Simulación Cuenta 2 (" + c2.titular + ") ---");
        while (c2.saldo < 500) {
            c2.saldo += 50;
            mesesC2++;
            System.out.println(c2.titular + " : " + c2.saldo);
        }

        System.out.println("\nResultados finales:");
        System.out.println("Meses necesarios para " + c1.titular + ": " + mesesC1);
        System.out.println("Meses necesarios para " + c2.titular + ": " + mesesC2);
    }
}