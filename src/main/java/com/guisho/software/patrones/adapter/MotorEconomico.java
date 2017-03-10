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
public class MotorEconomico extends Motor {

    public MotorEconomico(){
        super();
        System.out.println("Craendo motor economico");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor economico.");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor economico.");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor economico.");
    }


}
