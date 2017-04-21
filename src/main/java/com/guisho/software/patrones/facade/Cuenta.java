/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.facade;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author lfernandez
 */
public class Cuenta {
    private int numeroDeMesa;
    private Date tiempoInicio;
    private List <MenuItem> itemsCuenta;
    private Double totalCuenta;
    
    public Cuenta(int numeroDeMesa){
        this.itemsCuenta = new ArrayList();
        this.totalCuenta=0d;
        DateFormat df = DateFormat.getDateTimeInstance (DateFormat.MEDIUM, DateFormat.MEDIUM, new Locale ("en", "EN"));       
        this.tiempoInicio=new Date();
        String fechaFormateada = df.format (this.tiempoInicio);        
        System.out.println("Creando cuenta para mesa <"+numeroDeMesa+"> a las <"+fechaFormateada+">");
    }
    
    public void agregarItem(MenuItem menuItem){
        this.itemsCuenta.add(menuItem);
        this.totalCuenta=this.totalCuenta+menuItem.getPrecio();
    }
    
    
    public Double getTotalCuenta(){
        System.out.println("\tResumen de la cuenta:");
        for (MenuItem mi:this.itemsCuenta){
            System.out.println("\t \t<"+mi.getNombre()+"> \t\t Q<"+mi.getPrecio()+">");            
        }
        System.out.println("\t ** Total <"+this.totalCuenta+">");
        return this.totalCuenta;
    }
    public void pagar (Double pago){
        System.out.println("Recibiendo <"+pago+">, por saldo de <"+this.totalCuenta+">");
        System.out.println("Vuelto <"+(pago-this.totalCuenta)+">");
        System.out.println("Muchas gracias por visitarnos!");
        
    }

    public int getNumeroDeMesa() {
        return numeroDeMesa;
    }

    public Date getTiempoInicio() {
        return tiempoInicio;
    }

    public List<MenuItem> getItemsCuenta() {
        return itemsCuenta;
    }
    
    
    
}
