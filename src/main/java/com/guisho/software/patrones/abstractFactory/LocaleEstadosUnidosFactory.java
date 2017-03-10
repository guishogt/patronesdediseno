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
public class LocaleEstadosUnidosFactory extends AbstractLocaleFactory{

    public LocaleEstadosUnidosFactory(){
        this.pais=AbstractLocaleFactory.US;
    }


    public Traductor createTraductor() {
        return TraductorFactory.createTraductor("ingles");
    }

    public Reloj createReloj() {
        return RelojFactory.createReloj(RelojFactory.RELOJ_AM_PM);
    }

}
