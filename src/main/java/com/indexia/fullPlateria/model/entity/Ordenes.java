package com.indexia.fullPlateria.model.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ordenes")
public class Ordenes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_orden")
    private int idOrden;
    @Column(name = "total")
    @Basic(optional = false)
    private double total;
    @Column(name = "fecha_orden")
    @Basic(optional = false)
    private Date fechaOrden;
    @Column(name = "estado")
    @Basic(optional = false)
    private String estado;

    @ManyToOne
    private Usuarios idUsuario;
    @OneToMany(mappedBy = "idOrden")
    private List<DetallesOrden> deatallesOrden;
    @OneToMany(mappedBy = "idOrden")
    private List<Pagos> idPago;

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<DetallesOrden> getDeatallesOrden() {
        return deatallesOrden;
    }

    public void setDeatallesOrden(List<DetallesOrden> deatallesOrden) {
        this.deatallesOrden = deatallesOrden;
    }

    public List<Pagos> getIdPago() {
        return idPago;
    }

    public void setIdPago(List<Pagos> idPago) {
        this.idPago = idPago;
    }
}
