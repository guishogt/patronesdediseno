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
public class PaqueteDeHosting {

    /*Los siguientes campos son obligatorios siempre*/
    private String nombre;
    private BigDecimal precioAnual;
    private int capacidadDeAlmacenamiento; //en MB
    private int transferenciaMensual; //en MB
    private int cantidadDireccionesCorreo;//

    /*Las siguientes son opcionales, hay planes que no los tienen*/
    private int cantidadSitiosPermitidos;
    private int cantidadBaseDeDatos;
    private boolean accesoSsh;
    private boolean panelDeControl;
    private String ipPublica;
    private String codigoOferta;

    public PaqueteDeHosting(String nombre, BigDecimal precioAnual, int almacenamiento, int transferencia, int cantidadCorreos) {
        this.nombre = nombre;
        this.precioAnual = precioAnual;
        this.capacidadDeAlmacenamiento = almacenamiento;
        this.transferenciaMensual = transferencia;
        this.cantidadDireccionesCorreo = cantidadCorreos;
    }



    public boolean isAccesoSsh() {
        return accesoSsh;
    }

    public void setAccesoSsh(boolean accesoSsh) {
        this.accesoSsh = accesoSsh;
    }

    public int getCantidadBaseDeDatos() {
        return cantidadBaseDeDatos;
    }

    public void setCantidadBaseDeDatos(int cantidadBaseDeDatos) {
        this.cantidadBaseDeDatos = cantidadBaseDeDatos;
    }

    public int getCantidadDireccionesCorreo() {
        return cantidadDireccionesCorreo;
    }

    public void setCantidadDireccionesCorreo(int cantidadDireccionesCorreo) {
        this.cantidadDireccionesCorreo = cantidadDireccionesCorreo;
    }

    public int getCantidadSitiosPermitidos() {
        return cantidadSitiosPermitidos;
    }

    public void setCantidadSitiosPermitidos(int cantidadSitiosPermitidos) {
        this.cantidadSitiosPermitidos = cantidadSitiosPermitidos;
    }

    public int getCapacidadDeAlmacenamiento() {
        return capacidadDeAlmacenamiento;
    }

    public void setCapacidadDeAlmacenamiento(int capacidadDeAlmacenamiento) {
        this.capacidadDeAlmacenamiento = capacidadDeAlmacenamiento;
    }

    public String getCodigoOferta() {
        return codigoOferta;
    }

    public void setCodigoOferta(String codigoOferta) {
        this.codigoOferta = codigoOferta;
    }

    public String getIpPublica() {
        return ipPublica;
    }

    public void setIpPublica(String ipPublica) {
        this.ipPublica = ipPublica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPanelDeControl() {
        return panelDeControl;
    }

    public void setPanelDeControl(boolean panelDeControl) {
        this.panelDeControl = panelDeControl;
    }

    public BigDecimal getPrecioAnual() {
        return precioAnual;
    }

    public void setPrecioAnual(BigDecimal precioAnual) {
        this.precioAnual = precioAnual;
    }

    public int getTransferenciaMensual() {
        return transferenciaMensual;
    }

    public void setTransferenciaMensual(int transferenciaMensual) {
        this.transferenciaMensual = transferenciaMensual;
    }

    /* mas constructores */
    /* Setters, getters y demás código....*/
}
