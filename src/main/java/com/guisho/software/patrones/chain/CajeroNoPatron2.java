/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.chain;

/**
 *
 * @author lfernandez
 */
public class CajeroNoPatron2 {

    public boolean sacarDinero(int cantidad) {
        boolean toReturn = false;
        int cantidadPendiente = cantidad;
        
        cantidadPendiente = calcularBilletesADarDeDenominiacion(200, cantidadPendiente);  
        cantidadPendiente = calcularBilletesADarDeDenominiacion(100, cantidadPendiente);  
        cantidadPendiente = calcularBilletesADarDeDenominiacion(50, cantidadPendiente);  

        if (cantidadPendiente!=0) {
            System.out.println("La cantidad solicitada <" + cantidad + "> no es válida.");
        } else {
            System.out.println("Gracias por utilizar nuestro servicio, le fueron servidos Q<"+cantidad+">");
        }
        return toReturn;
    }

    private int calcularBilletesADarDeDenominiacion(int denominacion, int cantidad) {
        int cantidadPendiente = cantidad;

        if (cantidadPendiente >= denominacion) {
            System.out.println("Cantidad Pendiente " + cantidadPendiente + ", dare <" + cantidadPendiente / denominacion + "> billetes de Q"+denominacion+" y me sobran <" + cantidad % denominacion + ">");
            cantidadPendiente = cantidad % denominacion;
        }
        return cantidadPendiente;
    }
}
