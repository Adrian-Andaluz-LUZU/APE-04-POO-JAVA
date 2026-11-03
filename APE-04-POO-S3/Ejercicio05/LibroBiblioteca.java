public class LibroBiblioteca {
    String titulo;
    boolean disponible;

    public LibroBiblioteca(String titulo) {
        this.titulo = titulo;
        this.disponible = true;
    }

    public boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    public void devolver() {
        disponible = true;
    }
}