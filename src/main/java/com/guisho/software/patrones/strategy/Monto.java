/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.strategy;

import com.guisho.software.patrones.chain.*;
import java.math.BigDecimal;

/**
 *
 * @author lfernandez
 */
public class Monto {
    private String moneda="Quetzal";
    private BigDecimal cantidad;
    
    public Monto(BigDecimal cantidad){
        this.cantidad=cantidad;
    }
    

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public BigDecimal getCantidad() {
        this.cantidad = this.cantidad.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
