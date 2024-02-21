package org.example;
import java.util.ArrayList;

/**
**Clase Concesionario
 * * esta clase gestiona los coches del concesionario, manteniendo una lista con arrays.
 ** Objetos tipo auto
 * * @author Alejandro Riesgo / Tunivers
 * * @version 0.1, 2024/02/20*/

public class Concesionario {
    /**
     *Lista autos
     * Objeto tipo arraylist que tiene objetos auto

     * @param agregarauto El parámetro agregarauto define el número de elementos que va a tener la serie aleatoria.

     */
    //constructor que inicializa la lista autos
    private ArrayList<Auto> autos;

    /**
     *metodo para añadir auto
     *constructor de la clase concesionario
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }



    /**
     * metodo para añadir auto
     * requiere el meto auto para agregar
     * @param auto
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * genera una lista de autos
     * @return
     */

    public ArrayList<Auto> listarAutos() {
        return autos;
    }


    /**
     * * Metodo que muestra un bucle para imprimir modelos de coches
     * *


     * * El metodo no devueve nada, solo comprueba.
     * * Bucle for de si hay autos, suma 1 cada vez que se van añadiendo a la lista
     * *Llamada al metodo imprimirAutos
     * */

    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}
