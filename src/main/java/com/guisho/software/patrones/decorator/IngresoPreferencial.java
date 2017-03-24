/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.decorator;

import java.util.List;

/**
 *
 * @author lfernandez
 */
public class IngresoPreferencial extends BoletoDeAvionDecorator{

    public IngresoPreferencial(BoletoDeAvion boleto) {
        super(boleto);
    }
    
    
    
      @Override
    public List<String> getAmenidades() {
         this.getBoleto().getAmenidades().add("Ingreso Preferencial");
         return this.getBoleto().getAmenidades();
    }

    @Override
    public Double getCosto() {
        return this.getBoleto().getCosto()+100.0;
    }
}
