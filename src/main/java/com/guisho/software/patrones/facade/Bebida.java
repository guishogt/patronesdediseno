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
public class Bebida implements MenuItem{
    
    private String nombreBebida;
    private Double precio;
    
    public Bebida(String nobmre,Double precio){
        this.nombreBebida=nobmre;
        this.precio=precio;
        
    }
    
    public void preparar(){
        System.out.println("Preparando bebida <"+this.nombreBebida+">");
    }
    
    public String getNombre(){
        return this.nombreBebida;
    }

    @Override
    public Double getPrecio() {
      return this.precio;   
    }
}
