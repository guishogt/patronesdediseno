/**
*     Luis H. Fernandez, luishernan@gmail.com
*     software.guisho.com
*     Created as part of my private exam for Universidad Galileo, 2017. Use it freely, LGPL. 
**/

package com.guisho.software.patrones.factory;

/**
 *
 * @author guisho.com, luishernan@gmail.com
 */
public class TraductorFactory {

    public TraductorFactory(){

    }

    public static Traductor createTraductor(String idioma){
        if (idioma.equals("espanol")){
            return new TraductorEspanol();
        }
        if (idioma.equals("ingles")){
            return new TraductorIngles();
        }
        if (idioma.equals("aleman")){
            return new TraductorAleman();
        }

        return null;
    }

}
