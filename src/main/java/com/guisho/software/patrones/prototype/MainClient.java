/**
 *     Luis H. Fernandez, luishernan@gmail.com
 *     software.guisho.com
 *     Created as part of my private exam for Universidad Galileo, 2017. Use it freely, LGPL. 
 **/
package com.guisho.software.patrones.prototype;

/**
 *
 * @author guisho.com, luishernan@gmail.com
 */
public class MainClient {

    public static void main(String[] args) {
        Persona juan = new Persona();
        juan.setNombres("Juan José");
        juan.setAppellidos("Pérez Ramirez");
        juan.setNombrePadre("Juan Pérez Martinez");
        juan.setNombreMadre("María Ramirez");
        juan.setDireccion("9a. Ave. 43-12 Z.1");
        juan.setTelCasa("34567890");
        juan.setNacionalidad("Guatemalteca");
        juan.setCiudadEnQueVive("Guatemala");
        juan.setNombreMascota("Pepito");

        //Hacer algo con Juan, ingresarlo al sistema, etc...
        System.out.println("Ingresando al sistema:"+juan.toString());

        //Persona maria = (Persona)juan.clone();
        Persona maria = juan.creaPrototipo();

        maria.setNombres("María Inés");
        System.out.println("Ingresando al sistema:"+maria.toString());

        //ingresar a Maria al sistema....

    }
}
