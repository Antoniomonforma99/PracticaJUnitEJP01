package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio2 {

    public List<Integer> listasOrden (List<Integer> listaUno, List<Integer> listaDos){
        Collections.sort(listaUno);
        Collections.sort(listaDos);

        List<Integer> listaFinal = new ArrayList<Integer>();

        for (Integer num : listaUno){
            listaFinal.add(num);
        }
        for (Integer num : listaDos){
            listaFinal.add(num);
        }
        return listaFinal;
    }
}
