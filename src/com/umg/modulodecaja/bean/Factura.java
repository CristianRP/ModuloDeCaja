/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.modulodecaja.bean;

/**
 *
 * @author cramirez
 */
public class Factura {
    private int idFactura;
    private String serie;
    private String estado;
    private String fechaCreacion;

    public Factura() {
    }

    public Factura(int idFactura, String serie, String estado, String fechaCreacion) {
        this.idFactura = idFactura;
        this.serie = serie;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    
}
