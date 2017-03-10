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
public class Main {
    

    public static void main(String[] args) {
        Motor motor = new MotorEconomico();
        motor.encender();
        motor.acelerar();
        motor.apagar();

        motor = new MotorGaston();
        motor.encender();
        motor.acelerar();
        motor.apagar();


        motor = new MotorElectricoAdapter() ;
        motor.encender();
        motor.acelerar();
        motor.apagar();

    }

}
