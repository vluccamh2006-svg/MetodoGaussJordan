# Método de Gauss-Jordan - Métodos Numéricos

Práctica correspondiente a la Unidad 3 de la materia de Métodos Numéricos del Instituto Tecnológico Superior de Xalapa (ITSX).

* **Docente:** Víctor Hugo Vásquez Herrera
* **Carrera:** Ingeniería en Sistemas Computacionales

## Estructura modular del proyecto
El código fue diseñado bajo el principio de reutilización de software y modularidad, dividido en las siguientes clases:

* `defmatrizz.java`: Define la matriz aumentada [A | b] con el sistema de ecuaciones a resolver.
* `Gauss.java`: Contiene el método de eliminación gaussiana (`eliminacionGaussiana`) para realizar la triangulación superior.
* `GaussJordan.java`: Reutiliza el método de triangulación superior de la clase `Gauss`, e implementa la normalización de pivotes a 1 y el barrido superior para obtener la matriz identidad.
* `Lanzador_GaussJordan.java`: Clase principal que coordina la ejecución de las clases anteriores y muestra las soluciones directamente en consola.

## Lenguaje de programación
* **Java** (JDK 21)

## Pasos para compilar y ejecutar
1. Clonar o descargar el repositorio en tu equipo.
2. Abrir el proyecto en **IntelliJ IDEA**.
3. Verificar que la versión del JDK esté bien configurada.
4. Ejecutar la clase principal **`Lanzador_GaussJordan.java`**.

## Ejemplo de prueba y salida por consola
Al ejecutar el programa, se obtiene el siguiente resultado en texto plano:

```text
Soluciones del sistema (Método de Gauss-Jordan):
x1 = 3.0
x2 = -2.5
x3 = 7.000000000000002

Process finished with exit code 0