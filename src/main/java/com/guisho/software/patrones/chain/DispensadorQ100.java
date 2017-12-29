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
public class DispensadorQ100 implements ICadenaDispensamiento {

    private ICadenaDispensamiento siguiente;
    private final int currencyToDispense = 100;

    @Override
    public void siguienteEnLaCadena(ICadenaDispensamiento siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void dispensar(Monto monto) {
        int pendiente = 0;
        if (monto.getCantidad() >= this.currencyToDispense) {
            pendiente = monto.getCantidad() % this.currencyToDispense;
            System.out.println("Soy Q100 Dispensando <" + monto.getCantidad() / this.currencyToDispense + "> billetes pendiente  <" + pendiente + ">");
            if (pendiente>0){
                this.siguiente.dispensar(new Monto(pendiente));
            }            
        } else {
            this.siguiente.dispensar(monto);
        }

    }
}
