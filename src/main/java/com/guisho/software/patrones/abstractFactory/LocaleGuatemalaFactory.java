/**
*     Luis H. Fernandez, luishernan@gmail.com
*     software.guisho.com
*     Created as part of my private exam for Universidad Galileo, 2017. Use it freely, LGPL. 
**/

package com.guisho.software.patrones.abstractFactory;

import com.guisho.software.patrones.factory.Traductor;
import com.guisho.software.patrones.factory.TraductorFactory;

/**
 *
 * @author guisho.com, luishernan@gmail.com
 */
public class LocaleGuatemalaFactory extends AbstractLocaleFactory{

    public LocaleGuatemalaFactory(){
        this.pais=this.GT;
    }
    public Traductor createTraductor() {
        return TraductorFactory.createTraductor("espanol");
    }

    public Reloj createReloj() {
        return RelojFactory.createReloj(RelojFactory.RELOJ_24_HRS);
    }

}
