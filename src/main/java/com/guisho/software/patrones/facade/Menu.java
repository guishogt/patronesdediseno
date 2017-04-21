/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guisho.software.patrones.facade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lfernandez
 */
public class Menu {

    private List<MenuItem> itemsMenu;

    private static Menu menu;

    private Menu() {
        System.out.println("Creando el menú");
        //Agregar los items que existen....
        this.itemsMenu = new ArrayList();

        //agregando bebidas....
        this.itemsMenu.add(new Bebida("Agua", 10d));
        this.itemsMenu.add(new Bebida("Cerveza", 25d));
        this.itemsMenu.add(new Bebida("Limonada", 19d));

        //agregando platos
        this.itemsMenu.add(new Plato("Hamburguesa", 20d));
        this.itemsMenu.add(new Plato("Papas Fritas", 15d));
        this.itemsMenu.add(new Plato("Hot Dog", 18d));

    }

    public static Menu getMenu() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public boolean existeEnMenu(String aBuscar) {
        for (MenuItem mi : this.itemsMenu) {
            if (mi.getNombre().toLowerCase().contains(aBuscar.toLowerCase()) ) {
                return true;
            }
        }
        return false;
    }

    public MenuItem getItem(String item) {
        for (MenuItem mi : this.itemsMenu) {
            if (mi.getNombre().toLowerCase().contains(item.toLowerCase())) {
                return mi;
            }
        }
        return null;
    }

}
