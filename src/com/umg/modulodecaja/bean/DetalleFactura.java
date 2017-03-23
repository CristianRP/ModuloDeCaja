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
public class DetalleFactura {
    private int idDetalleFactura;
    private int idEncabezadoFactura;
    private int idProducto;
    private int cantidad;
    private int subTotal;
    private int total;

    public DetalleFactura() {
    }

    public DetalleFactura(int idDetalleFactura, int idEncabezadoFactura, int idProducto, int cantidad, int subTotal, int total) {
        this.idDetalleFactura = idDetalleFactura;
        this.idEncabezadoFactura = idEncabezadoFactura;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.total = total;
    }

    

    public int getIdDetalleFactura() {
        return idDetalleFactura;
    }

    public void setIdDetalleFactura(int idDetalleFactura) {
        this.idDetalleFactura = idDetalleFactura;
    }

    public int getIdEncabezadoFactura() {
        return idEncabezadoFactura;
    }

    public void setIdEncabezadoFactura(int idEncabezadoFactura) {
        this.idEncabezadoFactura = idEncabezadoFactura;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
}
