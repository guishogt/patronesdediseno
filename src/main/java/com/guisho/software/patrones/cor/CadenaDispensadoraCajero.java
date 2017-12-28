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
public class CadenaDispensadoraCajero {
    
    private ICadenaDispensamiento q200;
    
    public CadenaDispensadoraCajero(){
        q200 = new DispensadorQ200();
        ICadenaDispensamiento q100 = new DispensadorQ100();
        ICadenaDispensamiento q50 = new DispensadorQ50();
        ICadenaDispensamiento dispensadorDefault = new DispensadorDefault();
        q200.siguienteEnLaCadena(q100);
        q100.siguienteEnLaCadena(q50);
        q50.siguienteEnLaCadena(dispensadorDefault);
    } 
    
    public void dispensar(Monto monto){
        this.q200.dispensar(monto);
    }
 
}
