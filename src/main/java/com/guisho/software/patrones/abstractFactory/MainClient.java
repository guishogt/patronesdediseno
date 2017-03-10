/**
*     Luis H. Fernandez, luishernan@gmail.com
*     software.guisho.com
*     Created as part of my private exam for Universidad Galileo, 2017. Use it freely, LGPL. 
**/

package com.guisho.software.patrones.abstractFactory;

import com.guisho.software.patrones.factory.Traductor;

/**
 *
 * @author guisho.com, luishernan@gmail.com
 */
public class MainClient {


    public static void main(String[] args) {

        Reloj reloj = null;
        Traductor traductor = null;

        AbstractLocaleFactory localeFactory = new LocaleEstadosUnidosFactory();
        reloj = localeFactory.createReloj();
        traductor = localeFactory.createTraductor();

        System.out.println("--------");
        System.out.println("1="+traductor.traducirNumero(1));
        System.out.println(reloj.dameLaHora());
        
    }
}
