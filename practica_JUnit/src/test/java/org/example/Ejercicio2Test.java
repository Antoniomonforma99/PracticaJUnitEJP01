package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio2Test {
    static Ejercicio2 ej2 = new Ejercicio2();
    static List<Integer> listaUno = new ArrayList<>();
    static List<Integer> listaDos = new ArrayList<>();
    static List<Integer> listaFinal = new ArrayList<>();
    static List<Integer> listaVacia = new ArrayList<>();

    @Test
    @BeforeAll
    static void crear(){
        listaUno.add(1);
        listaUno.add(2);
        listaUno.add(3);
        listaUno.add(4);
        listaDos.add(2);
        listaDos.add(1);
        listaDos.add(3);
        listaDos.add(4);
        listaFinal.add(1);
        listaFinal.add(1);
        listaFinal.add(2);
        listaFinal.add(3);
        listaFinal.add(3);
        listaFinal.add(4);
        listaFinal.add(4);
    }

    @Test
    void listasUnidas(){
        assertEquals(listaFinal,ej2.listasOrden(listaUno,listaDos));
    }
    @Test
    void listasVacia(){
        assertNotEquals(listaFinal,ej2.listasOrden(listaVacia,listaVacia));
    }
    @Test
    void unaVacia(){
        assertEquals(listaUno,ej2.listasOrden(listaUno,listaVacia));
    }
}