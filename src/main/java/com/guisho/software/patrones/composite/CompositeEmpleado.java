/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lfernandez
 */
public abstract class CompositeEmpleado extends AbstractEmpleado{
    
    private List<Empleado> equipo;
    
    public CompositeEmpleado(String nombre, String apellido, String departamento) {
        super(nombre, apellido, departamento);
        equipo=new ArrayList<Empleado>();
    }

    public List<Empleado> getEquipo() {
        return equipo;
    }

    public void addEmpleado (Empleado e){
        this.equipo.add(e);
    }
    
    @Override
    public String getDescripcion() {
        String tr=  "Nombre: <"+this.getNombre()+"> Apellido <"+this.getApellido()+"> Departamento <"+this.getDepartamento()+"> Puesto <Programador Lider> Equipo: \n";
        for (Empleado e:this.equipo){
            tr+="\t"+e.getDescripcion()+"\n";
        }
        return tr; 
    
    }    

}
