public class MainEjercicio1 {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("Mario Vargas Llosa", "Peruana");

        Libro libro1 = new Libro("Cien años de soledad", 1967, autor1);
        Libro libro2 = new Libro("La ciudad y los perros", 1963, autor2);

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}