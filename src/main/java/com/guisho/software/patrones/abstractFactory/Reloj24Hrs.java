/**
 *     Luis H. Fernandez, luishernan@gmail.com
 *     software.guisho.com
 *     Created as part of my private exam for Universidad Galileo, 2017. Use it freely, LGPL. 
 **/
package com.guisho.software.patrones.abstractFactory;

import java.util.Date;

/**
 *
 * @author guisho.com, luishernan@gmail.com
 */
public class Reloj24Hrs extends Reloj {

    public String dameLaHora() {
        Date d = new Date();
        int hora = d.getHours();
        int minutos = d.getMinutes();
        int segundos = d.getSeconds();
        String tr;
        tr = " " + hora + ":" + minutos + ":" + segundos + " ";

        return tr;
    }
}
