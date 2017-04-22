/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.facade;

import java.util.Arrays;

/**
 *
 * @author lfernandez
 */
public class Mesero implements IMesero {
    
    private Cocina cocina;
    private Menu menu;
    private Cuenta cuenta;
    
    public Mesero(){
        this.cocina = this.cocina.getCocina();
        this.menu = this.menu.getMenu();
        this.cuenta = new Cuenta(5);        
        System.out.println("Bienvenidos! ¿puedo tomar su orden?");  
        
    }
    
    @Override
    public void ordenar(String comidaOBebida){
        if (this.menu.existeEnMenu(comidaOBebida)){
            MenuItem item = this.menu.getItem(comidaOBebida);
            this.cuenta.agregarItem(item);
            this.cocina.prepararPlatoOBebida(item);
            
        } else {
            System.out.println("\t Lo sentimos, no tenemos en este momento <"+comidaOBebida+">");
        }
        
    }
    
    public void traerComida() {
        System.out.println("Llevando comidas y bebidas a la mesa");
        for(MenuItem mi:cuenta.getItemsCuenta()){
            System.out.println("\t Colocando en mesa <"+mi.getNombre()+">");
        }
    }

    public void solicitarCuenta() {
        System.out.println("Solicitando cuenta");
        Double totalAPagar = this.cuenta.getTotalCuenta();
    }

    public void pagar(Double pago) {
        this.cuenta.pagar(pago);
    }
    
    

    
}
