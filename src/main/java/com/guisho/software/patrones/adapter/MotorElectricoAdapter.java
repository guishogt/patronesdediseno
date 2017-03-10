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
public class MotorElectricoAdapter extends Motor{
    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter(){
        super();
        this.motorElectrico = new MotorElectrico();
        System.out.println("Creando motor Electrico adapter");
    }
    @Override
    public void encender() {
        System.out.println("Encendiendo motorElectricoAdapter");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor electrico...");
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor electrico");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();

    }

}
