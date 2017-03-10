/**
*     Luis H. Fernandez, luishernan@gmail.com
*     software.guisho.com
*     Created as part of my private exam for Universidad Galileo, 2017. Use it freely, LGPL. 
**/

package com.guisho.software.patrones.builder;

import java.math.BigDecimal;

/**
 *
 * @author guisho.com, luishernan@gmail.com
 */
public class MainClient {

    public static void main(String[] args) {


        PaqueteDeHosting personal = new PaqueteDeHostingBuilder("personal",new BigDecimal(100),10,100,1).build();
        PaqueteDeHosting bronce =
        new PaqueteDeHostingBuilder("bronce",new BigDecimal(200),100,1000,10).accessoSsh(true).build();
        PaqueteDeHosting plata =
        new PaqueteDeHostingBuilder("plata",new BigDecimal(300),100,1000,50).accessoSsh(true).catidadSitiosPermitidos(10).cantidadBaseDeDatos(1).build();
        PaqueteDeHosting oro =
        new PaqueteDeHostingBuilder("oro",new BigDecimal(500),100,4000,100).accessoSsh(true).catidadSitiosPermitidos(100).cantidadBaseDeDatos(5).ipPublica("10.10.10.10").build();

    }

}
