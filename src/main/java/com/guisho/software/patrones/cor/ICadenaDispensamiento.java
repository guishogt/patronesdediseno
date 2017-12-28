/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.cor;

/**
 *
 * @author lfernandez
 */
public interface ICadenaDispensamiento {
    void siguienteEnLaCadena(ICadenaDispensamiento siguiente);
    void dispensar(Monto monto);
}
