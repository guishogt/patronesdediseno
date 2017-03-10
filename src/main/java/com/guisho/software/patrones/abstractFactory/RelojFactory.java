/**
*     Luis H. Fernandez, luishernan@gmail.com
*     software.guisho.com
*     Created as part of my private exam for Universidad Galileo, 2017. Use it freely, LGPL. 
**/

package com.guisho.software.patrones.abstractFactory;

/**
 *
 * @author guisho.com, luishernan@gmail.com
 */
public class RelojFactory {
    public static final int RELOJ_AM_PM=0;
    public static final int RELOJ_24_HRS=1;

    public RelojFactory(){

    }

    public static Reloj createReloj(int tipoDeReloj){
        if (tipoDeReloj==RelojFactory.RELOJ_24_HRS){
            return new Reloj24Hrs();
        }
        if (tipoDeReloj==RelojFactory.RELOJ_AM_PM){
            return new RelojAmPm();
        }

        return null;
    }

}
