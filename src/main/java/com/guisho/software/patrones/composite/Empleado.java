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
public interface Empleado {

    public String getNombre();
    public String getApellido();
    public String getDepartamento();
    public String getDescripcion();

    public List<Empleado> getEquipo();
    public void addEmpleado(Empleado e);
}
