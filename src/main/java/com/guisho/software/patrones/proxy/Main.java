/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.proxy;

import com.guisho.software.patrones.facade.IMesero;
import com.guisho.software.patrones.facade.Mesero;

/**
 *
 * @author lfernandez
 */
public class Main {
    
    
    public static void main(String[] args) {
        IMesero mesero = new MeseroExperimentado();
        mesero.ordenar("agua");
        mesero.ordenar("cerveza");   
        mesero.ordenar("naranjada");
        mesero.ordenar("hamburguesa");
        mesero.ordenar("hot dog");
        mesero.ordenar("pastel de chocolate");
        mesero.traerComida();        
        mesero.solicitarCuenta();
        mesero.pagar(100d);
    }
}
