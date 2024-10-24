package com.indexia.fullPlateria.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "detalles_orden")
public class DetallesOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalles_orden")
    @Basic(optional = false)
    private int iddetallesOrden;
    @Column(name = "cantidad")
    @Basic(optional = false)
    private int cantidad;
    @Column(name = "precio")
    @Basic(optional = false)
    private double precio;

    @ManyToOne
    private Ordenes idOrden;
    @ManyToOne
    private Productos idProducto;

    public int getIddetallesOrden() {
        return iddetallesOrden;
    }

    public void setIddetallesOrden(int iddetallesOrden) {
        this.iddetallesOrden = iddetallesOrden;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Ordenes getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Ordenes idOrden) {
        this.idOrden = idOrden;
    }

    public Productos getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Productos idProducto) {
        this.idProducto = idProducto;
    }
}
