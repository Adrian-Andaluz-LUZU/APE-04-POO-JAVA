package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("Carlos", 8.5, 9.0, 8.0),
            new Estudiante("Ana", 6.0, 5.5, 6.5),
            new Estudiante("Luis", 4.0, 4.5, 4.0),
            new Estudiante("Maria", 7.5, 8.0, 7.0),
            new Estudiante("Pedro", 5.0, 5.5, 5.0)
        };

        int aprobados = 0;

        for (Estudiante e : estudiantes) {
            String estado;
            if (e.promedio >= 7.0) {
                estado = "Aprobado";
                aprobados++;
            } else if (e.promedio >= 5.0) {
                estado = "Supletorio";
            } else {
                estado = "Reprobado";
            }
            System.out.println(e.nombre + ": " + String.format("%.2f", e.promedio) + " (" + estado + ")");
        }
        System.out.println("\nEstudiantes que aprobaron: " + aprobados);
    }
}
