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
public class TvSatelital extends BoletoDeAvionDecorator{

    public TvSatelital(BoletoDeAvion boleto) {
        super(boleto);
    }
    
    

    @Override
    public List<String> getAmenidades() {
         this.getAmenidades().add("TV Satelital");
         return this.getAmenidades();
    }

    @Override
    public Double getCosto() {
        return this.getCosto()+75.0;
    }


    
}
