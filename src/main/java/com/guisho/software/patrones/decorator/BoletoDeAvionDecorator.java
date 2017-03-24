/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lfernandez
 */
public abstract class BoletoDeAvionDecorator implements BoletoDeAvion {

    private BoletoDeAvion boleto;
    private List<String> amenidades;

    public BoletoDeAvionDecorator(BoletoDeAvion boleto) {
        this.boleto = boleto;
        this.amenidades=new ArrayList<String>();
    }
    
    public abstract List<String> getAmenidades();
    public abstract Double getCosto();
    
    public BoletoDeAvion getBoleto(){
        return this.boleto;
    }
    
    
    
}
