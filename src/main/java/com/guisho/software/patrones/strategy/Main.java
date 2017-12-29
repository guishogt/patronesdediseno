/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.strategy;

import java.math.BigDecimal;

/**
 *
 * @author lfernandez
 */
public class Main {
    
    
    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        System.out.println("Bienvenido a su tienda en linea!");
        Item camisa = new Item ("0001",new Monto(new BigDecimal(299.99)),"Camisa");
        Item pantalon = new Item ("0002",new Monto(new BigDecimal(355.00)),"Pantalon");
        Item sueter = new Item ("0003",new Monto(new BigDecimal(235.99)),"Sueter");
        
        carrito.agretarItem(camisa);
        carrito.agretarItem(pantalon);
        carrito.agretarItem(sueter);
        
        carrito.pagar(new EstrategiaTarjetaCredito("Luis Fernandez", "1234-1234-1234-1234", "123"));
        
        System.out.println("Adios!");
        
    }
}
