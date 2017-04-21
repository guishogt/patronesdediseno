/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.facade;

/**
 *
 * @author lfernandez
 */
public class Cocina {
 
    private static Cocina cocina;
    
 
    private Cocina(){
        System.out.println("Creando cocina");
    }

    /**
     * Implementando un singleton. 
     * @return 
     */
    public static Cocina getCocina(){
        if (cocina==null){
            cocina = new Cocina();
        } 
        return cocina;
    }

    MenuItem prepararPlatoOBebida(MenuItem bebida) {
        System.out.println("\t En cocina preparando bebida <"+bebida.getNombre()+">");
        //preparar la bebida
        return bebida;
    }




    
    
    
    
    
    
}
