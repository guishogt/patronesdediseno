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
public class BoletoPrimeraClase implements BoletoDeAvion{
    List<String> amenidades = new ArrayList<String>();
        

    @Override
    public List <String> getAmenidades() {
        this.amenidades.add("Boleto primera clase");
        return this.amenidades;
    }

    @Override
    public Double getCosto() {
        return 1000.0;
    }

   
    
    
}
