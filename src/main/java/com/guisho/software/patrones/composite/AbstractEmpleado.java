/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.composite;

import java.util.List;

/**
 *
 * @author lfernandez
 */
public abstract class AbstractEmpleado implements Empleado{

    private String nombre;
    private String apellido;
    private String departamento;

    public AbstractEmpleado(String nombre, String apellido, String departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departmento) {
        this.departamento = departmento;
    }
 
}
