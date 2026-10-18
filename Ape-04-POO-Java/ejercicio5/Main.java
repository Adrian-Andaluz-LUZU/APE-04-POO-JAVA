package ejercicio5;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("Don Quijote", "Cervantes", true);
        Libro l2 = new Libro("Cien Anios de Soledad", "Garcia", true);
        Libro l3 = new Libro("La Odisea", "Homero", true);
        Libro l4 = new Libro("El Principito", "Saint-Exupery", true);

        Socio s1 = new Socio("Mateo", 0);
        Socio s2 = new Socio("Emily", 0);

        // Primer socio presta 2 libros (l1 y l2)
        l1.disponible = false;
        l2.disponible = false;
        s1.librosPrestados += 2;

        // Segundo socio presta 1 libro (l3)
        l3.disponible = false;
        s2.librosPrestados += 1;

        Libro[] libros = {l1, l2, l3, l4};
        int disponiblesCount = 0;

        System.out.println("--- Estado de Libros ---");
        for (Libro l : libros) {
            String estado = l.disponible ? "Disponible" : "Prestado";
            System.out.println(l.titulo + ": " + estado);
            if (l.disponible) {
                disponiblesCount++;
            }
        }

        System.out.println("\n--- Estado de Socios ---");
        System.out.println(s1.nombre + ": " + s1.librosPrestados + " libros prestados");
        System.out.println(s2.nombre + ": " + s2.librosPrestados + " libros prestados");

        System.out.println("\nLibros que quedan disponibles: " + disponiblesCount);
    }
}
