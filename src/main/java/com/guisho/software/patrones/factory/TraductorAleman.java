/**
*     Luis H. Fernandez, luishernan@gmail.com
*     software.guisho.com
*     Created as part of my private exam for Universidad Galileo, 2017. Use it freely, LGPL. 
**/

package com.guisho.software.patrones.factory;

/**
 *
 * @author guisho.com, luishernan@gmail.com
 */
public class TraductorAleman extends Traductor{

    public String traducirNumero(int numero) {
        switch(numero){
       	   case 0: return "null";
       	   case 1: return "eins";
       	   case 2: return "zwei";
       	   case 3: return "drei";
       	   case 4: return "vier";
       	   case 5: return "funf";
       	   case 6: return "sechs";
           case 7: return "sieben";
       	   case 8: return "acht";
       	   case 9: return "neun";
       	   case 10: return "zen";
        }
        return null;
    }

}
