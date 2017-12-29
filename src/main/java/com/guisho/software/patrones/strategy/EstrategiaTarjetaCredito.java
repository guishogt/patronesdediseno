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
public class EstrategiaTarjetaCredito implements IEstrategiaDePago{

    private String nombre;
    private String numeroTarjeta;
    private String cvv;

    public EstrategiaTarjetaCredito(String nombre, String numeroTarjeta, String cvv) {
        this.nombre = nombre;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        //Aqui pueden hacerse validaciones.
    }
    
    
    
    @Override
    public boolean pagar(Monto monto) {
        System.out.println("Realizando el Pago con Tarjeta de Crédito por <"+monto.getCantidad()+">");
        return true; //En el ejemplo el pago es exitoso.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    
    
    
    
}
