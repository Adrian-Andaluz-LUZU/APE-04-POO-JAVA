public class Cuenta {
    String titular;
    double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public void transferir(Cuenta destino, double monto) { // Objeto destino recibido como parámetro
        if (retirar(monto)) {
            destino.depositar(monto);
            System.out.println("Transferencia exitosa de $" + monto + " de " + titular + " a " + destino.titular);
        } else {
            System.out.println("Error: Fondos insuficientes en la cuenta de " + titular);
        }
    }

    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + " | Saldo actual: $" + saldo);
    }
}