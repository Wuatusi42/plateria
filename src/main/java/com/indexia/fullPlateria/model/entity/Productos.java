package com.indexia.fullPlateria.model.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    @Basic(optional = false)
    private Integer idProducto;
    @Column(name = "nombre")
    private String nombreProducto;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio")
    private double precio;
    @Column(name = "stock")
    private int stock;
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;
    @ManyToOne
    @JoinColumn(name = "fk_categoria",referencedColumnName = "id_categoria")
    private Categorias fkCategoria;
  @ManyToOne
  @JoinColumn(name = "fk_proveedor",referencedColumnName = "id_proveedor")
    private Proveedores fkProveedor;
    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Categorias getFkCategoria() {
        return fkCategoria;
    }

    public void setFkCategoria(Categorias fkCategoria) {
        this.fkCategoria = fkCategoria;
    }

    public Proveedores getFkProveedor() {
        return fkProveedor;
    }

    public void setFkProveedor(Proveedores fkProveedor) {
        this.fkProveedor = fkProveedor;
    }
}
