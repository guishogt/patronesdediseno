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
public class MeseroExperimentado implements IMesero{
    
    IMesero meseroNuevo;
    
    public MeseroExperimentado(){
        this.meseroNuevo=new Mesero();
        System.out.println("Quiero comentarles que tendremos a un mesero en entrenamiento apoyándonos, si es un problema, hacérmelo saber.");
    }

    @Override
    public void ordenar(String comidaOBebida) {
        System.out.println("Mesero nuevo, por favor agregar <"+comidaOBebida+">");
        this.meseroNuevo.ordenar(comidaOBebida);
        
    }

    @Override
    public void traerComida() {
        System.out.println("Mesero nuevo, favor traer la comida ");
        this.meseroNuevo.traerComida();
    }

    @Override
    public void solicitarCuenta() {
        System.out.println("Mesero nuevo, llevar la cuenta, y explicar bien cada gasto. ");
        this.meseroNuevo.solicitarCuenta();
    }

    @Override
    public void pagar(Double pago) {
        System.out.println("Mesero nuevo, realizar el pago y agradecer a nuestros clientes");
        this.meseroNuevo.pagar(pago);
        System.out.println("Gracias por visitarnos y apoyarnos entrenando a nuestro mesero nuevo!");
    }
    
}
