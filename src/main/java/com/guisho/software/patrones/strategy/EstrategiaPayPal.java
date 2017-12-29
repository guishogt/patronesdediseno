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
public class EstrategiaPayPal implements IEstrategiaDePago {
    private String usuario; 
    private String passwoprd;

    public EstrategiaPayPal(String usuario, String passwoprd) {
        this.usuario = usuario;
        this.passwoprd = passwoprd;
    }

        @Override
    public boolean pagar(Monto monto) {
        System.out.println("Realizando el Pago con Paypal por <"+monto.getCantidad()+">");
        return true;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPasswoprd() {
        return passwoprd;
    }

    public void setPasswoprd(String passwoprd) {
        this.passwoprd = passwoprd;
    }
    
    


    
}
