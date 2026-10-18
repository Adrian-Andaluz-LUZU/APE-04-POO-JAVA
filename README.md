# APE-04-POO-JAVA
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)

Este repositorio contiene la resolución de los 5 ejercicios prácticos propuestos en la **Guía APE 4** para la asignatura de Programación Orientada a Objetos.

---
# Resolución de Ejercicios
## Ejercicio 1: Notas del curso
### Enunciado:

 Crear la clase Estudiante con los atributos nombre, nota1, nota2, nota3 y promedio. En main, crear 5 instancias, calcular el promedio de cada una e imprimirlas una debajo de otra con el formato nombre: promedio, agregando Aprobado (7 o más), Supletorio (de 5 a 6.99) o Reprobado (menos de 5). Al final, imprimir cuántos estudiantes aprobaron.
 ### Descripción de la solución:
 
Se creó la clase Estudiante calculando el promedio automáticamente desde el constructor. En la clase principal se instanciaron 5 estudiantes en un arreglo, evaluando su rendimiento mediante un bucle e identificando el estado académico de cada uno junto con el conteo final de aprobados.

### Evidencia de codificación
<img width="535" height="163" alt="Captura de pantalla 2026-10-18 113137" src="https://github.com/user-attachments/assets/e827db9e-0881-44e1-a188-ef364e77eb8b" />

---
## Ejercicio 2: Inventario de una tienda
### Enunciado:

Crear la clase Producto con nombre, precio y stock. Crear 4 productos e imprimirlos con el formato nombre: precio. Simular la venta de 3 unidades de dos de ellos, mostrar "Reponer" junto a cada producto que quede con menos de 5 unidades e imprimir el valor total del inventario (suma de precio por stock).

### Descripción de la solución:

Se definió la clase Producto con sus atributos correspondientes. Se crearon 4 instancias, se actualizó el stock reduciendo 3 unidades en dos productos seleccionados y se calculó el valor total del inventario acumulando la multiplicación de precio por stock, añadiendo la etiqueta "Reponer" en los ítems con stock menor a 5.

### Evidencia de codificación
<img width="532" height="222" alt="Captura de pantalla 2026-10-18 113354" src="https://github.com/user-attachments/assets/780600d7-24bc-4729-9913-f9d916b7a8cd" />

---
## Ejercicio 3: Veterinaria
### Enunciado:

Crear la clase Mascota con nombre, especie, edad y peso. Crear 3 mascotas e imprimirlas con el formato nombre: especie: peso, mostrando "Revisar peso" si pesan más de 20 kg. Luego escribir Mascota m4 = m1;, sumar 1 a m4.edad, imprimir m1.edad y explicar en un comentario por qué cambió.

### Descripción de la solución:

Se instanciaron 3 objetos de tipo Mascota imprimiendo sus datos y agregando una alerta condicional según su peso. Se demostró el comportamiento del paso por referencia en Java al asignar m4 = m1, evidenciando que ambas variables apuntan a la misma dirección de memoria, por lo que las modificaciones en m4 afectan directamente a m1.

### Evidencia de codificación
<img width="531" height="148" alt="Captura de pantalla 2026-10-18 173338" src="https://github.com/user-attachments/assets/f9735b6d-ff36-447d-9663-34acc1fc354e" />

---
## Ejercicio 4: Cuenta de ahorro
### Enunciado:

Crear la clase Cuenta con titular y saldo. Crear 2 cuentas, una con 200 y otra con 350. Con un while, depositar 50 por mes en cada cuenta hasta que llegue a 500, imprimiendo cada mes con el formato titular : saldo, y al final cuántos meses necesitó cada una (6 y 3).

### Descripción de la solución:

Se implementó la clase Cuenta y se crearon dos objetos con sus saldos iniciales. Mediante bucles while independientes, se realizaron depósitos recurrentes de 50 hasta alcanzar la meta de 500, contabilizando e imprimiendo el progreso mensual de cada cuenta.

### Evidencia de codificación
<img width="562" height="245" alt="Captura de pantalla 2026-10-18 173548" src="https://github.com/user-attachments/assets/0e23df83-b4d2-41b8-89b1-a82d43d4db9f" />

---
## Ejercicio 5: Biblioteca
### Enunciado:

Crear las clases Libro (titulo, autor, disponible) y Socio (nombre, librosPrestados). Crear 4 libros y 2 socios, registrar que el primer socio presta 2 libros y el segundo presta 1 (disponible = false y aumentar librosPrestados), y al final imprimir cada libro con el formato titulo: Disponible / titulo: Prestado, cada socio con el formato nombre: librosPrestados y cuántos libros quedan disponibles.

### Descripción de la solución:

Se diseñaron las clases Libro y Socio. Se simularon los préstamos cambiando el estado del atributo disponible a false e incrementando el contador de libros prestados de cada socio. Al final, se recorrió la lista de libros para mostrar su disponibilidad y calcular los ejemplares que aún quedan libres.

### Evidencia de codificación
<img width="551" height="214" alt="Captura de pantalla 2026-10-18 173715" src="https://github.com/user-attachments/assets/bb46d6ed-77e8-4bf3-bf33-75001972cf1e" />


