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
public class PaqueteDeHostingBuilder {
    private  PaqueteDeHosting paquete;
    
    
    public PaqueteDeHostingBuilder(String nombre, BigDecimal precio, int cantidadAlmacenamiento, int transferenciaMesual, int cantidadCorreo){
        this.paquete.setNombre(nombre);
        this.paquete.setPrecioAnual(precio);
        this.paquete.setCapacidadDeAlmacenamiento(cantidadAlmacenamiento);
        this.paquete.setTransferenciaMensual(transferenciaMesual);
        this.paquete.setCantidadDireccionesCorreo(cantidadCorreo);
    }
    
    public PaqueteDeHostingBuilder catidadSitiosPermitidos (int cantidad){
        this.paquete.setCantidadSitiosPermitidos(cantidad);
        return this;
    }

    public PaqueteDeHostingBuilder cantidadBaseDeDatos (int cantidad){
        this.paquete.setCantidadBaseDeDatos(cantidad);
        return this;
    }

    public PaqueteDeHostingBuilder accessoSsh(boolean acceso){
        this.paquete.setAccesoSsh(acceso);
        return this;
    }

    public PaqueteDeHostingBuilder panelControl (boolean panel){
        this.paquete.setPanelDeControl(panel);
        return this;
    }

    public PaqueteDeHostingBuilder codigoOferta(String codigo){
        this.paquete.setCodigoOferta(codigo);
        return this;
    }

    public PaqueteDeHostingBuilder ipPublica (String ip){
        this.paquete.setIpPublica(ip);
        return this;
    }

    public PaqueteDeHosting build(){
        return this.paquete;
    }

}
