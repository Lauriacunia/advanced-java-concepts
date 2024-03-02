package com.lau;

import java.util.function.IntBinaryOperator;

/* 1-Definición de la Interfaz: Primero, definimos una interfaz funcional llamada Operacion.
Una interfaz funcional es aquella que tiene un único método abstracto.
En este caso, el método abstracto es ejecutar,
que toma dos parámetros x e y y retorna un resultado de tipo entero.
La anotación @FunctionalInterface indica que esta interfaz es una interfaz funcional.
 */
@FunctionalInterface
interface Operacion {
    int ejecutar(int x, int y);
}

public class MyLambda{
    public static void main(String[] args) {
        /* 2- Implementación con Lambda: Luego, creamos una lambda que
         implementa el método ejecutar de la interfaz Operacion.
          La lambda toma dos parámetros x e y y retorna el resultado de sumarlos.*/
        Operacion suma = (x, y) -> x + y;

        /* Implementación de lambda para la multiplicación
          la lambda para la multiplicación utiliza la interfaz funcional IntBinaryOperator de Java,
          que representa una operación que toma dos argumentos de tipo int y
          retorna un resultado de tipo int.*/
        IntBinaryOperator multiplicacion = (x, y) -> x * y;

        /* 3- Uso de la Implementación: Finalmente,
         utilizamos la lambda suma para sumar dos números.
          En este caso, sumamos los números 3 y 4, lo cual resulta en 7
         */
        int resultadoSuma = suma.ejecutar(3, 4);
        System.out.println("Resultado de la suma: " + resultadoSuma); // Imprime 7

        // Utilización de la implementación de la multiplicación
        int resultadoMultiplicacion = multiplicacion.applyAsInt(3, 4);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion); // Imprime 12
    }
}

