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
public class MainSinPatron {

    public static void main(String[] args) throws Exception {
     
            CajeroNoPatron2 cajero = new CajeroNoPatron2();
            int quantityToRequest=350;
            System.out.println("Voy a pedir <"+quantityToRequest+">");
            boolean obtuveDiunero = cajero.sacarDinero(quantityToRequest);
    }
}
