/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.bridge;

/**
 *
 * @author lfernandez
 */
public abstract class IMAbstracto {
    protected IPlataformaMovil plataforma;
    
    public IMAbstracto(IPlataformaMovil plataforma){
        this.plataforma=plataforma;
    }
    
    public abstract void enviarMensaje();
    
}
