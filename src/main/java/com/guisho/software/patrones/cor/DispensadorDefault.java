/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.cor;

/**
 *
 * @author lfernandez
 */
public class DispensadorDefault implements ICadenaDispensamiento{

    @Override
    public void siguienteEnLaCadena(ICadenaDispensamiento siguiente) {
        System.out.println("No haciendo nada, soy el final de la cadena");
    }

    @Override
    public void dispensar(Monto monto) {
        if (monto.getCantidad()>0){
            System.out.println("No es posible realizar su transacción en este momento");
        } else {
            System.out.println("Transacción realizada exitosamente");
        }
                
    }    
}
