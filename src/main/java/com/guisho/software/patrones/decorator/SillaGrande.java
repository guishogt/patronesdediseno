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
public class SillaGrande extends BoletoDeAvionDecorator{

    public SillaGrande(BoletoDeAvion boleto) {
        super(boleto);
    }
 
    
  @Override
    public String getAmenidades() {
         return this.getBoleto().getAmenidades()+", Silla Mas Grande";
    }

    @Override
    public Double getCosto() {
        return this.getBoleto().getCosto()+300.0;
    }    
}
