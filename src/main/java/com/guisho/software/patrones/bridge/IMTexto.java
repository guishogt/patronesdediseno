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
public class IMTexto extends IMAbstracto {
    
    public IMTexto(IPlataformaMovil plataforma) {
        super(plataforma);
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando mensaje de texto en <"+this.plataforma.getNombre()+">");
    }        
    
}
