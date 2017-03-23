/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.singleton;

public class TraductorPesado {

    private static boolean instanciated = false;

    private static TraductorPesado traductorInstance;

    /**
     * Notar que el constructor es privado!
     */
    private TraductorPesado() {
        //cargar un diccionario a memoria  a través de un WebService.
    }

    public static TraductorPesado getTraductorPesado() {
        if (!TraductorPesado.instanciated) {
            TraductorPesado.traductorInstance = new TraductorPesado();
            TraductorPesado.instanciated = true;
        }
        return TraductorPesado.traductorInstance;
    }

    public String translate(String toTranslate) {

        //mucho código bonito va aquí
        return null;
    }

    
    
}
