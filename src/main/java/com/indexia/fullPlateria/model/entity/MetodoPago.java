package com.indexia.fullPlateria.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "metodo_pago")
public class MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_metodo_pago")
    @Basic(optional = false)
    private int idmetodoPago;
    @Column(name = "metodo")
    @Basic(optional = false)
    private String metodo;

    @OneToMany(mappedBy = "idmetodoPago")
    List<Pagos> idPago;
    public int getIdmetodoPago() {
        return idmetodoPago;
    }

    public void setIdmetodoPago(int idmetodoPago) {
        this.idmetodoPago = idmetodoPago;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public List<Pagos> getIdPago() {
        return idPago;
    }

    public void setIdPago(List<Pagos> idPago) {
        this.idPago = idPago;
    }
}
