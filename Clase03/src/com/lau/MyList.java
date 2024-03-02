package com.lau;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        // Declarar un ArrayList de enteros
        ArrayList<Integer> listaDeEnteros = new ArrayList<>();

        // Declarar un ArrayList de cadenas
        ArrayList<String> listaDeCadenas = new ArrayList<>();

        // Declarar un ArrayList de objetos de una clase personalizada (por ejemplo, Persona)
        ArrayList<Persona> listaDePersonas = new ArrayList<>();

        // Declarar una lista de enteros y asignarle el ArrayList
        List<Integer> listaDeEnterosComoList = new ArrayList<>();

        // Agregar elementos a la lista
        listaDeEnteros.add(10);
        listaDeEnteros.add(20);
        listaDeEnteros.add(30);

        // Agregar elementos a la lista
        listaDeCadenas.add("Hola");
        listaDeCadenas.add("Mundo");

        // Crear objetos Persona
        Persona persona1 = new Persona("Juan", 30);
        Persona persona2 = new Persona("Maria", 25);

        // Agregar elementos a la lista
        listaDePersonas.add(persona1);
        listaDePersonas.add(persona2);

        // Agregar elementos a la lista
        listaDeEnterosComoList.add(10);
        listaDeEnterosComoList.add(20);

        // Obtener un elemento de la lista

        // Obtener el primer elemento de la lista de enteros
        int primerElemento = listaDeEnteros.get(0);
        System.out.println(primerElemento); // Imprime 10

        //imprimir variables
        System.out.println(listaDeCadenas);
        System.out.println(listaDePersonas);
        System.out.println(listaDeEnterosComoList);


    }
}
