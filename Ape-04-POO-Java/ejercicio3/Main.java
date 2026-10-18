package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Max", "Perro", 3, 22.5);
        Mascota m2 = new Mascota("Michi", "Gato", 2, 4.0);
        Mascota m3 = new Mascota("Rocky", "Perro", 4, 18.0);

        Mascota[] mascotas = {m1, m2, m3};

        System.out.println("--- Listado de Mascotas ---");
        for (Mascota m : mascotas) {
            String alertaPeso = (m.peso > 20) ? " -> Revisar peso" : "";
            System.out.println(m.nombre + ": " + m.especie + ": " + m.peso + " kg" + alertaPeso);
        }

        // Instrucción solicitada
        Mascota m4 = m1;
        m4.edad += 1;

        System.out.println("\nEdad de m1 modificada indirectamente: " + m1.edad);
        
        /* 
         * Explicación: m1.edad cambió porque en Java las variables de tipo objeto almacenan 
         * una referencia (dirección de memoria), no el objeto en sí. Al escribir "Mascota m4 = m1;", 
         * m4 comienza a apuntar exactamente al mismo objeto en memoria que m1. Por lo tanto, 
         * al modificar la edad a través de m4, el cambio se refleja en m1 porque ambos comparten 
         * la misma instancia.
         */
    }
}
