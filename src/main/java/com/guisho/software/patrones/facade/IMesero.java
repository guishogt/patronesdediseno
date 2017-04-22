/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.facade;

/**
 *
 * @author lfernandez
 */
public interface IMesero {

    void ordenar(String comidaOBebida);
    void traerComida();
    void solicitarCuenta();
    void pagar(Double pago);
}
