package com.indexia.fullPlateria.utils;

import com.indexia.fullPlateria.model.entity.Categorias;
import com.indexia.fullPlateria.model.entity.Proveedores;

import java.util.Date;

public class ProductoRequest {
    private String nameProduct;
    private String informacion;
    private Double price;
    private Integer cantidad;
    private Date dateCreation;
    private Categorias fkcategory;
    private Proveedores fkdistribuidor;

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Categorias getFkcategory() {
        return fkcategory;
    }

    public void setFkcategory(Categorias fkcategory) {
        this.fkcategory = fkcategory;
    }

    public Proveedores getFkdistribuidor() {
        return fkdistribuidor;
    }

    public void setFkdistribuidor(Proveedores fkdistribuidor) {
        this.fkdistribuidor = fkdistribuidor;
    }
}
