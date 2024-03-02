package com.lau;

import java.util.HashMap;
import java.util.Map;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Persona persona = (Persona) obj;
        return edad == persona.edad && nombre.equals(persona.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode() + edad;
    }
}

public class Maps {
    public static void main(String[] args) {
        // Declarar un HashMap de objetos Persona a cadenas
        Map<Persona, String> mapaDePersonas = new HashMap<>();

        // Crear objetos Persona
        Persona persona1 = new Persona("Juan", 30);
        Persona persona2 = new Persona("Maria", 25);

        // Agregar elementos al mapa
        mapaDePersonas.put(persona1, "Programador");
        mapaDePersonas.put(persona2, "Diseñador");

        // Obtener el valor asociado a una clave
        String profesion = mapaDePersonas.get(persona1);
        System.out.println(profesion); // Imprime "Programador"

        // Eliminar un elemento del mapa
        mapaDePersonas.remove(persona2);

        // Verificar si una clave está presente en el mapa
        boolean estaPresente = mapaDePersonas.containsKey(persona2);
        System.out.println(estaPresente); // Imprime false
    }

}
