/**
*     Luis H. Fernandez, luishernan@gmail.com
*     software.guisho.com
*     Created as part of my private exam for Universidad Galileo, 2017. Use it freely, LGPL. 
**/

package com.guisho.software.patrones.adapter;

/**
 *
 * @author guisho.com, luishernan@gmail.com
 */
public class MotorGaston extends Motor {

    public MotorGaston(){
        super();
        System.out.println("Creando el motor gaston");
    }

    @Override
    public void encender() {
        System.out.println("Bum, bum....encendiendo motor gaston");
    }

    @Override
    public void acelerar() {
        System.out.println("Buuuuuuuuuuuum, acelerando y gastando muuuucha gas");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor gaston");
    }

}
