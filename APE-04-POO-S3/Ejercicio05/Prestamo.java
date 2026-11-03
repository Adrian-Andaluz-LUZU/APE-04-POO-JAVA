public class Prestamo {
    Usuario usuario;
    LibroBiblioteca libro;

    public Prestamo(Usuario usuario, LibroBiblioteca libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    public void registrar() { // Colaboración y validación
        if (libro.prestar()) {
            System.out.println("Préstamo REGISTRADO: El libro '" + libro.titulo + "' ha sido prestado a " + usuario.nombre);
        } else {
            System.out.println("Préstamo RECHAZADO: El libro '" + libro.titulo + "' no está disponible para " + usuario.nombre);
        }
    }
}