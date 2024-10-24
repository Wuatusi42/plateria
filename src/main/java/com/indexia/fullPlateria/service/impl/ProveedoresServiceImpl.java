package com.indexia.fullPlateria.service.impl;

import com.indexia.fullPlateria.model.entity.Proveedores;
import com.indexia.fullPlateria.model.repository.ProveedoresDAO;
import com.indexia.fullPlateria.service.ProveedoresService;
import com.indexia.fullPlateria.utils.ProveedoresRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProveedoresServiceImpl implements ProveedoresService {
    @Autowired
    private ProveedoresDAO proveedoresDAO;

    @Override
    public Proveedores create(ProveedoresRequest proveedoresRequest) {
        Proveedores proveedor = new Proveedores();
        proveedor.setNombre(proveedoresRequest.getName());
        proveedor.setDireccion(proveedoresRequest.getUbicasion());
        proveedor.setEmail(proveedoresRequest.getCorreo());
        proveedor.setTelefono(proveedoresRequest.getPhone());
        proveedor.setFechaRegistro(proveedoresRequest.getDateRegister());
        return proveedoresDAO.save(proveedor);
    }

    @Override
    public List<Proveedores> findAll() {
        return proveedoresDAO.findAll();
    }
    @Override
    public Proveedores update(Integer idProveedor, Proveedores proveedorUpdate) {
    Optional<Proveedores> existe = proveedoresDAO.findById(idProveedor);//busco el id
    if (existe.isPresent()){//if si el producto existe esta presente cambiar los datos
        Proveedores proveedor = existe.get();
        proveedor.setNombre(proveedorUpdate.getNombre());
        proveedor.setDireccion(proveedorUpdate.getDireccion());
        proveedor.setEmail(proveedorUpdate.getEmail());
        proveedor.setTelefono(proveedorUpdate.getTelefono());
        proveedor.setFechaRegistro(proveedorUpdate.getFechaRegistro());
        return proveedoresDAO.save(proveedor);
    }
    else {
        return null;
    }

    }

    @Override
    public void delate(Integer idProveedores) {
        proveedoresDAO.deleteById(idProveedores);
    }

    @Override
    public Proveedores pathProveedor(Integer idProveedor, Proveedores proveedorPath) {
        Optional<Proveedores> existe = proveedoresDAO.findById(idProveedor);
        if (existe.isPresent()){
            Proveedores proveedores = existe.get();
            if (proveedorPath.getNombre() != null){
               proveedores.setNombre(proveedorPath.getNombre());
            }
            if (proveedorPath.getDireccion() != null){
                proveedores.setDireccion(proveedorPath.getDireccion());
            }
            if (proveedorPath.getEmail() != null){
                proveedores.setEmail(proveedorPath.getEmail());
            }
            if (proveedorPath.getFechaRegistro() != null){
                proveedores.setFechaRegistro(proveedorPath.getFechaRegistro());
            }
            return proveedoresDAO.save(proveedores);
        }
        return null;
    }
}
