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
public class EncabezadoFactura {
    private int idEncabezadoFactura;
    private int idFactura;
    private int idCliente;

    public EncabezadoFactura() {
    }

    public EncabezadoFactura(int idEncabezadoFactura, int idFactura, int idCliente) {
        this.idEncabezadoFactura = idEncabezadoFactura;
        this.idFactura = idFactura;
        this.idCliente = idCliente;
    }

    public int getIdEncabezadoFactura() {
        return idEncabezadoFactura;
    }

    public void setIdEncabezadoFactura(int idEncabezadoFactura) {
        this.idEncabezadoFactura = idEncabezadoFactura;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
}
