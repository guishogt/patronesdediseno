/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.guisho.software.patrones.factory;

/**
 *
 * @author luisfernandez
 */
public class MainClient {


    public static void main(String[] args) {
        System.out.println(TraductorFactory.createTraductor("espanol").traducirNumero(1));
    }
}
