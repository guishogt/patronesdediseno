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
public class BoletoDeCabina implements BoletoDeAvion{

    List<String> amenidades = new ArrayList<String>();
    public BoletoDeCabina() {
        this.amenidades.add("Boleto Cabina");
    }
        

    
    @Override
    public List <String> getAmenidades() {
        return this.amenidades;
    }

    @Override
    public Double getCosto() {
        return 1000.0;
    }

   
    
    
}
