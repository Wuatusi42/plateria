package com.indexia.fullPlateria.service;

import com.indexia.fullPlateria.model.entity.Proveedores;
import com.indexia.fullPlateria.utils.ProveedoresRequest;

import java.util.List;

public interface ProveedoresService {
    public Proveedores create(ProveedoresRequest proveedoresRequest);
    public List<Proveedores> findAll();
    public Proveedores update(Integer idProveedor,Proveedores proveedores);
    public void delate(Integer idProveedores);
    public Proveedores pathProveedor(Integer idProveedor,Proveedores proveedor);
}
