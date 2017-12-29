/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lfernandez
 */
public class Carrito {
    List<Item> items;
    
    public Carrito (){
        this.items=new ArrayList<Item>();        
    }
    
    public void agretarItem(Item item){
        this.items.add(item);
        System.out.println("Agregado <"+item.getDescripcion()+"> Valor <"+item.getMonto().getCantidad()+">");
    }
    
    public void quitarItem(Item item){
        this.items.remove(item);
    }
    
    public BigDecimal calcularMontoTotal(){
        BigDecimal total = new BigDecimal(0);
        for (Item item:items){
            total = total.add(item.getMonto().getCantidad());
        }
        return total;
    }
    
    public void pagar (IEstrategiaDePago estrategiaDePago){
        estrategiaDePago.pagar(new Monto (this.calcularMontoTotal()));
    }
}
