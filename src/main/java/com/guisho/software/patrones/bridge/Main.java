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
public class Main {
    
    
    public static void main(String[] args) {
        System.out.println("Bienvenidos. Vamos a mandar mensajes de texto.");
        IMAbstracto imTextoAndroid = new IMTexto(new PlataformaAndroid());
        imTextoAndroid.enviarMensaje();
        IMAbstracto imTextoIPhone = new IMTexto(new PlataformaIPhone());
        imTextoIPhone.enviarMensaje();
        
        IMAbstracto imVozAndroid = new IMVoz(new PlataformaAndroid());
        imVozAndroid.enviarMensaje();
        IMAbstracto imVozIPhone = new IMVoz(new PlataformaIPhone());
        imVozIPhone.enviarMensaje();
        
        
        
    }
}
