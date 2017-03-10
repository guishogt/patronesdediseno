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
public abstract class AbstractLocaleFactory {
    public static final String US="ESTADOS_UNIDOS";
    public static final String GT="GUATEMALA";

    String pais;

    public abstract Traductor createTraductor();
    public abstract Reloj createReloj();
    
    public String getPais(){
        return this.pais;
    }
    
    public void setPais(String pais){
        this.pais = pais;
    }


}
