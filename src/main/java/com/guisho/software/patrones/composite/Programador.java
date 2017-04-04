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
public class Programador extends AbstractEmpleado{

    public Programador(String nombre, String apellido, String departamento) {
        super(nombre, apellido, departamento);
    }

    @Override
    public String getDescripcion() {
        return "Nombre: <"+this.getNombre()+"> Apellido <"+this.getApellido()+"> Departamento <"+this.getDepartamento()+"> Puesto <Programador>";
    }    
}
