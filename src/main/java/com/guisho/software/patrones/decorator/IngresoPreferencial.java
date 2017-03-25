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
public class IngresoPreferencial extends BoletoDeAvionDecorator {

    public IngresoPreferencial(BoletoDeAvion boleto) {
        super(boleto);
    }

    @Override
    public String getAmenidades() {
        return this.getBoleto().getAmenidades() + ", Ingreso Preferencial";
    }

    @Override
    public Double getCosto() {
        return this.getBoleto().getCosto() + 101.0;
    }
}
