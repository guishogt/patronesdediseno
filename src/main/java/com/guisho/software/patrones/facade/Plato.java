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
public class Plato implements MenuItem{
    
    
 private String nombrePlato;
 private Double precio;
    
    public Plato(String nobmre,Double precio){
        this.nombrePlato=nobmre;
        this.precio=precio;
    }
    
    public void preparar(){
        System.out.println("Preparando plato <"+this.nombrePlato+">");
    }
    
    public String getNombre(){
        return this.nombrePlato;
    }

    @Override
    public Double getPrecio() {
        return this.precio;
    }
    
}
