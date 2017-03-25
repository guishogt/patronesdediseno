/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.decorator;

/**
 *
 * @author lfernandez
 */
public class Main {
    
    public static void main(String[] args) {
        
        BoletoDeAvion boleto = new SillaGrande(
                                    new IngresoPreferencial(
                                            new BebidasAlcoholicas(
                                                    new TvSatelital(
                                                            new BoletoDeCabinaEconomica()
                                                    )
                                            )
                                    )
        );
        
        System.out.println("Hola");
        System.out.println("Amenidades <"+boleto.getAmenidades()+"> ");
        System.out.println("Costo <"+boleto.getCosto()+">");
        
        
    }
    
    
}