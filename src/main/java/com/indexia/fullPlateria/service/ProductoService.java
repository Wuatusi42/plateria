package com.indexia.fullPlateria.service;

import com.indexia.fullPlateria.model.entity.Productos;
import com.indexia.fullPlateria.utils.ProductoRequest;


import java.util.List;

public interface ProductoService {
    public List<Productos> findAll();
    public List<Productos> findByAllCategoria(String categoria);
    public Productos create(ProductoRequest productoRequest);
    public void delate(Integer idProducto);
    public List<Productos> findByNombreProducto(String nombreProducto);
    public Productos update(Productos productos,Integer idProducto);
}
