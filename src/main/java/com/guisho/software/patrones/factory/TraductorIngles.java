/**
*     Luis H. Fernandez
*     guisho.com
*     Created as part of my private exam for Universidad Galileo, 2017. Use it freely, LGPL. 
**/
package com.guisho.software.patrones.factory;

/**
 *
 * @author guisho.com, luishernan@gmail.com
 */
public class TraductorIngles extends Traductor{

    public String traducirNumero(int numero) {
        switch(numero){
       	   case 0: return "cero";
       	   case 1: return "one";
       	   case 2: return "two";
       	   case 3: return "tree";
       	   case 4: return "four";
       	   case 5: return "five";
       	   case 6: return "six";
           case 7: return "seven";
       	   case 8: return "eight";
       	   case 9: return "nine";
       	   case 10: return "ten";
        }
           return null;
    }

}
