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
public class Monto {
    private String moneda="Quetzal";
    private int cantidad;
    
    public Monto(int cantidad){
        this.cantidad=cantidad;
    }
    

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
