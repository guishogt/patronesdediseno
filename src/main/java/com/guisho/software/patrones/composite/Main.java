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
        
        Empleado luis = new Programador("Luis", "Perez", "Desarrollo");
        Empleado maria = new Programador("Maria", "Lopez", "Desarrollo");
        Empleado pedro = new ProgramadorLider("Pedro", "Juarez", "Desarrollo");
        pedro.addEmpleado(luis);
        pedro.addEmpleado(maria);
        Empleado isabel = new GerenteDeProyecto("Isabel", "Godinez", "Comercial");
        isabel.addEmpleado(pedro);
        System.out.println(isabel.getDescripcion());
        
    }
            
}
