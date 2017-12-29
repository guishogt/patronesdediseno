/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.strategy;

/**
 *
 * @author lfernandez
 */
public class Item {
    private String codigo;
    private String descripcion;
    private Monto monto;

    public Item(String codigo, Monto monto, String descr) {
        this.codigo = codigo;
        this.monto = monto;
        this.descripcion=descr;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Monto getMonto() {
        return monto;
    }

    public void setMonto(Monto monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}
