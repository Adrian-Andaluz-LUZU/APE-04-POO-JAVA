public class MainEjercicio5 {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Paulo Escobar", "1805123456");
        Usuario u2 = new Usuario("Ariel Chanatasig", "1805987654");

        LibroBiblioteca libroComun = new LibroBiblioteca("Estructuras de Datos en Java");

        // Dos usuarios intentan pedir el mismo libro
        Prestamo p1 = new Prestamo(u1, libroComun);
        p1.registrar(); // Debería pasar con éxito

        Prestamo p2 = new Prestamo(u2, libroComun);
        p2.registrar(); // Debería fallar porque ya está prestado
    }
}