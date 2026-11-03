# APE 04 POO – Semana 3

## Ejercicio 1: Libro y Autor
**Tema:** Objeto como atributo.

### Enunciado
Crea la clase `Autor` (nombre, nacionalidad) y la clase `Libro` (titulo, anio, autor). `Libro` debe tener un atributo de tipo `Autor` y un método `mostrarInformacion()` que imprima el título, el año y el nombre del autor. En `main`, crea 2 libros.

### Descripción de la resolución
Para resolver este ejercicio, se crean dos clases: `Autor` y `Libro`. La clase `Autor` contiene los atributos nombre y nacionalidad, mientras que la clase `Libro` contiene el título, el año de publicación y un objeto de tipo `Autor`. Se implementa el método `mostrarInformacion()` para mostrar los datos del libro junto con el nombre de su autor. Finalmente, en la clase principal se crean dos objetos de tipo `Autor` y dos objetos de tipo `Libro` para demostrar la relación entre ambas clases.

### Evidencia de ejecución
<img width="380" height="178" alt="image" src="https://github.com/user-attachments/assets/3d85c2d1-30b0-4e54-932d-e9102a0a7c28" />

---
## Ejercicio 2: Rectángulo
**Tema:** Firmas de métodos.

### Enunciado
Crea la clase `Rectangulo` (base, altura) con los siguientes métodos, usando el tipo de retorno correcto en cada firma. `obtenerDescripcion()` devuelve, por ejemplo, “Rectángulo de 4.0 x 6.0”, y `mostrar()` imprime todos los resultados.

### Descripción de la resolución
Para resolver este ejercicio, se crea la clase `Rectangulo` con los atributos base y altura. Se implementan los métodos `calcularArea()` para obtener el área, `calcularPerimetro()` para calcular el perímetro y `esCuadrado()` para comprobar si ambos lados tienen la misma medida. Además, se desarrolla `obtenerDescripcion()` para devolver una descripción del rectángulo y `mostrar()` para imprimir todos los resultados. Finalmente, se instancia un objeto en la clase principal para comprobar el funcionamiento de los métodos.

### Evidencia de ejecución
<img width="363" height="165" alt="image" src="https://github.com/user-attachments/assets/1492a379-293c-4603-a5cd-6e23041e4228" />

---

## Ejercicio 3: Producto y Venta
**Tema:** Objeto como parámetro.

### Enunciado
Crea la clase `Producto` (nombre, precio, stock) con `reducirStock(int cantidad)`, que solo actúa si hay stock suficiente (si no, imprime “Stock insuficiente.”), y `mostrarProducto()`. Crea la clase `Venta` (cantidad) con `aplicar(Producto producto)`, que reduzca el stock y muestre el total a pagar, igual que Cuenta y Transaccion.

### Descripción de la resolución
Para resolver este ejercicio, se crean las clases `Producto` y `Venta`. La clase `Producto` contiene los atributos nombre, precio y stock, además del método `reducirStock(int cantidad)`, que verifica si existe suficiente inventario antes de disminuir las unidades disponibles. La clase `Venta` contiene el atributo cantidad y el método `aplicar(Producto producto)`, que recibe un objeto de tipo `Producto` como parámetro, solicita la reducción del stock y calcula el total a pagar multiplicando el precio por la cantidad. Finalmente, se realizan pruebas para comprobar una venta y la validación del inventario.

### Evidencia de ejecución
<img width="440" height="128" alt="image" src="https://github.com/user-attachments/assets/8e2b17f0-b0b7-4790-97cb-5a23cde06728" />


