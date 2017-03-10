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
public class RelojAmPm extends Reloj{

    public RelojAmPm(){

    }

    public String dameLaHora() {
        Date d = new Date();
        int hora = d.getHours();
        int minutos = d.getMinutes();
        int segundos = d.getSeconds();
        String tr;
        if (hora<=12){
            tr=" "+hora+":"+minutos+":"+segundos+" AM";
        } else {
            tr=" "+(hora-12)+":"+minutos+":"+segundos+" PM";
        }

        return tr;
    }

}
