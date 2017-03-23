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
public class Producto {
    private int idProducto;
    private String descripcion;
    private String tipo;
    private float precio;

    public Producto() {
    }

    public Producto(int idProducto, String descripcion, String tipo, float precio) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
