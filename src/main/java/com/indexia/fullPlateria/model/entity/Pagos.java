package com.indexia.fullPlateria.model.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "pagos")
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pago")
    private int idPago;
    @Column(name = "monto")
    @Basic(optional = false)
    private Double monto;
    @Column(name = "fecha_pago")
    @Basic(optional = false)
    private Date fechaPago;
    @Column(name = "estado")
    @Basic(optional = false)
    private String estado;

    @ManyToOne
    private Ordenes idOrden;
    @ManyToOne
    private MetodoPago idmetodoPago;

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Ordenes getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Ordenes idOrden) {
        this.idOrden = idOrden;
    }

    public MetodoPago getIdmetodoPago() {
        return idmetodoPago;
    }

    public void setIdmetodoPago(MetodoPago idmetodoPago) {
        this.idmetodoPago = idmetodoPago;
    }
}

