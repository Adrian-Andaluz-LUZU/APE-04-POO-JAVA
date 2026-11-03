# METODOS-en-java-SEMANA2
---
## Ejercicio 1: Identificación de tipos de retorno

###  Enunciado
Dado el siguiente método en Java, se analiza por qué genera un error de compilación y cómo se corrige[cite: 2]:

\`\`\`java
public int calcularArea(double base, double altura) {
    double area = base * altura;
    System.out.println("El área es: " + area);
}
\`\`\`

---

###  Análisis del Error de Compilación

El fragmento anterior genera un error de compilación por dos motivos fundamentales:

1. **Falta de sentencia de retorno (`return`):** El método está declarado con el tipo de retorno **`int`** (`public int ...`), lo que obliga por norma en Java a que el bloque de código devuelva un valor entero mediante la instrucción `return`[cite: 2]. Al no incluirla, el compilador se detiene.
2. **Incompatibilidad de tipos:** La operación `base * altura` involucra valores de tipo `double`, por lo que la variable `area` es de tipo `double`[cite: 2]. Intentar retornar un valor `double` (o no retornar nada) en un método que promete devolver un `int` rompe las reglas de tipado estático de Java.

---

###  Soluciones Posibles

Dependiendo del diseño que necesites, existen dos formas correctas de solucionarlo:

#### Opción 1: Cambiar el tipo de retorno a `void` (Recomendada)
Si el propósito del método es únicamente calcular e imprimir el resultado por consola, no es necesario que retorne ningún valor[cite: 2]. Basta con cambiar `int` por `void`:

\`\`\`java
public void calcularArea(double base, double altura) {
    double area = base * altura;
    System.out.println("El área es: " + area);
    // Al ser void, no se requiere la instrucción return
}
\`\`\`

#### Opción 2: Mantener el tipo `int` y retornar el valor con conversión explícita
Si el método estrictamente necesita devolver un valor entero, debes realizar un *cast* (conversión) del resultado y agregar el `return` al final:

\`\`\`java
public int calcularArea(double base, double altura) {
    int area = (int) (base * altura); // Conversión explícita de double a int
    System.out.println("El área es: " + area);
    return area; // Sentencia de retorno obligatoria
}
\`\`\`

---
## Ejercicio 2: Métodos void para acciones directas

###  Enunciado
Crear un método en una clase llamada `Bienvenida` que reciba `String nombre` e `int edad`, e imprima un saludo en consola indicando ambos datos[cite: 3].

###  Explicación del Tipo de Retorno
* **Tipo de retorno:** `void`[cite: 3].
* **Justificación:** El método se encarga exclusivamente de una tarea de salida (mostrar texto en pantalla mediante `System.out.println`) sin requerir el cálculo de un valor que deba ser devuelto (`return`) al flujo principal del programa.

### Implementación
\`\`\`java
public class Bienvenida {
    public void mostrarBienvenida(String nombre, int edad) {
        System.out.println("Hola " + nombre + ", tienes " + edad + " años. ¡Bienvenido al sistema!");
    }
}
\`\`\`

---

## Ejercicio 3: Parámetros vs. Argumentos

###  Enunciado
Identificar parámetros y argumentos en un fragmento de código Java y explicar su diferencia[cite: 4].

### Identificación
* **Parámetros:** `x` e `y` (definidos en la cabecera del método `public double multiplicar(double x, double y)`).
* **Argumentos:** `4.0` y `5.0` (los valores reales enviados al invocar el método: `miObjeto.multiplicar(4.0, 5.0)`).

### Diferencia Clave
* **Parámetro:** Variable local definida en la firma del método que actúa como receptora de datos.
* **Argumento:** Valor real (o literal/variable con datos) que se suministra al método al momento de llamarlo.
---

## Ejercicio 4: El comportamiento del paso por valor

### Enunciado
Analiza el siguiente bloque de código. Si la variable `numero` original en el `main` vale `10` antes de llamar al método, ¿cuál será su valor impreso en consola después de ejecutar el método? Explica por qué.

```java
public void incrementar(int n) {
    n = n + 5;
}
```

### Resolución y Explicación
* **Resultado:** El valor de la variable en el `main` **sigue siendo 10**.
* **Explicación:** En Java, los argumentos de tipos primitivos (como `int`) se pasan **por valor**. Esto significa que el método `incrementar` recibe únicamente una **copia** del dato. La modificación `n = n + 5` solo altera la variable local dentro del ámbito del método y no afecta a la variable original declarada en el `main`.

---

## Ejercicio 5: Creación de un método con múltiples parámetros

### Enunciado
Agrega un nuevo método a la clase `Calculadora` llamado `calcularPromedio` que reciba tres notas de tipo `double` (`n1`, `n2`, `n3`), calcule el promedio sumándolas y dividiéndolas entre 3, y retorne el resultado final.

### Resolución
El método debe declarar tres parámetros de tipo `double`, realizar la suma entre paréntesis para asegurar el orden de las operaciones matemáticas, dividir para 3 y retornar un tipo `double`.

```java
public class Calculadora {

    // Método para calcular el promedio de tres notas
    public double calcularPromedio(double n1, double n2, double n3) {
        double promedio = (n1 + n2 + n3) / 3.0;
        return promedio;
    }

}
```

---
## Ejercicio 6: Validación de datos (Control de errores)

### Enunciado
Crea un método `verificarEdad` que reciba una edad (`int edad`). Si la edad es menor a 0 o mayor a 120, debe imprimir "Edad inválida" y retornar `false`. Si es correcta, debe retornar `true`.

### Resolución
El método utiliza el operador lógico `||` (OR) para verificar los límites fuera del rango válido ($< 0$ o $> 120$) y devolver un valor de tipo `boolean`.

```java
public class Evaluador {

    // Método para validar rango de edad
    public boolean verificarEdad(int edad) {
        if (edad < 0 || edad > 120) {
            System.out.println("Edad inválida");
            return false;
        }
        return true;
    }

}
```

---

## Ejercicio 7: Completar la Clase Producto

### Enunciado
Rellena los espacios vacíos (`__`) en la siguiente clase para que cumpla con calcular el valor total del inventario de un producto:

```java
public class Producto {
    String nombre;
    int stock;
    double precioUnitario;

    public __ calcularValorTotal() {
        __ stock * precioUnitario;
    }
}
```

### Resolución
Para completar el código:
1. El tipo de retorno debe ser `double`, ya que la multiplicación de un entero (`int`) por un decimal (`double`) produce un `double`.
2. Se utiliza la palabra clave `return` para devolver el resultado del cálculo.

```java
public class Producto {
    String nombre;
    int stock;
    double precioUnitario;

    // Código completado
    public double calcularValorTotal() {
        return stock * precioUnitario;
    }
}
```

---

## Ejercicio 8: Instanciación e Invocación en el Main

### Enunciado
Escribe el código necesario dentro del método `main` de una clase principal para:
1. Instanciar un objeto de la clase `Producto` llamado `p`.
2. Asignarle un `stock = 10` y un `precioUnitario = 25.5`.
3. Llamar al método `calcularValorTotal()`, guardar el resultado en una variable llamada `totalInventario` e imprimirla en consola.

### Resolución
En este ejercicio se crea una instancia con el operador `new`, se asignan valores a los atributos del objeto y se almacena el retorno del método en una variable local para mostrarlo en pantalla.

```java
public class Main {
    public static void main(String[] args) {
        // a. Instanciar objeto de la clase Producto
        Producto p = new Producto();

        // b. Asignar atributos
        p.stock = 10;
        p.precioUnitario = 25.5;

// c. Invocación del método, almacenamiento e impresión del resultado
        double totalInventario = p.calcularValorTotal();
        System.out.println("El valor total del inventario es: $" + totalInventario);
    }
}
```
