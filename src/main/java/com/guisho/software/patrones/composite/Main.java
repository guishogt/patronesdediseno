/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.composite;

/**
 *
 * @author lfernandez
 */
public class Main {
    public static void main(String[] args) {
        
        Programador luis = new Programador("Luis", "Perez", "Investigación");
        Programador maria = new Programador("Maria", "Lopez", "Investigación");
        ProgramadorLider pedro = new ProgramadorLider("Pedro", "Juarez", "Investigación");
        pedro.addEmpleado(luis);
        pedro.addEmpleado(maria);
        GerenteDeProyecto isabel = new GerenteDeProyecto("Isabel", "Godinez", "Comercial");
        isabel.addEmpleado(pedro);
        System.out.println(isabel.getDescripcion());
        
    }
            
}
