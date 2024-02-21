package org.example;
import java.util.ArrayList;


/**

 * * La clase auto para definir ña marca y modelo del vehiculo
 * * @author Alejandro Riesgo / Tunivers
 * * @version 0.1, 2024/02/20*/

public class Auto {
    /** Unico punto de entrada.
     * @param args Array de Strings.
     * @return No devuelve ningun valor.

     */
    private String marca;


    private String modelo;


    /**
     * * Variable marca y modelo
     * * Son variables fijas
     * * (Not null) los valores son obligados de insercion
     **/

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * El valor de ajuste de marca da valores a la clase auto
     * @HasGetter

     */
    public String getMarca() {
        return marca;
    }

    /**
     * El valor de ajuste de marca da valores a la clase auto

     * @HasSetter
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * El valor de ajuste de modelo da valores a la clase auto
     * @HasGetter

     */
    public String getModelo() {
        return modelo;
    }

    /**
     * El valor de ajuste de modelo da valores a la clase auto

   f  * @HasSetter
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * * Es una breve descripcion de la clase Auto
     * * Define un metodo override.ç
     * Sobreescribe el metodo ToString
     * * @Override
     */

    @Override
    public String toString() {
        return "Coche [marca=" + marca + ", modelo=" + modelo + "]";
    }
}
