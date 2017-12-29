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
public class CajeroNoPatron {
    
    public CajeroNoPatron(){
        //
    }
    
    /**
     * Retorna true si la transaccion se da, false de lo contrario. 
     * @param cantidad
     * @return 
     */
    public boolean sacarDinero(int cantidad){
        boolean toReturn = false;
        int cantidadPendiente=cantidad;
        if (cantidadPendiente>=200){
            System.out.println("Cantidad Pendiente "+cantidadPendiente+", dare <"+cantidadPendiente/200+"> billetes de Q200 y me sobran <"+cantidad%200+">");
            cantidadPendiente=cantidad%200;
            if (cantidadPendiente==0) { toReturn=true;}
        }
        if (cantidadPendiente>=100){
            System.out.println("Cantidad Pendiente "+cantidadPendiente+", dare <"+cantidadPendiente/100+"> billetes de Q100 y me sobran <"+cantidad%100+">");
            cantidadPendiente=cantidad%100;
            if (cantidadPendiente==0) { toReturn=true;}
        }               
        if (cantidadPendiente>=50){
            System.out.println("Cantidad Pendiente "+cantidadPendiente+", dare <"+cantidadPendiente/50+"> billetes de Q50 y me sobran <"+cantidad%50+">");
            cantidadPendiente=cantidad%50;
            if (cantidadPendiente==0) { toReturn=true;}
        }        
        if (!toReturn){
            System.out.println("La cantidad solicitada <"+cantidad+"> no es válida.");
        } else {
            System.out.println("Gracias por utilizar nuestro servicio, le fueron servidos Q<"+cantidad+">");
        }
        return toReturn;
    }
}
