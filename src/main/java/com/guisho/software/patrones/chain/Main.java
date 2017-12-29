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
public class Main {
       public static void main(String[] args) {
        System.out.println("Hola");
        CadenaDispensadoraCajero  cajero = new CadenaDispensadoraCajero();
        Monto m = new Monto(50);
        cajero.dispensar(m);
    }   
}
