package com.indexia.fullPlateria.service.impl;

import com.indexia.fullPlateria.model.entity.Productos;
import com.indexia.fullPlateria.model.repository.ProductosDAO;
import com.indexia.fullPlateria.service.ProductoService;
import com.indexia.fullPlateria.utils.ProductoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiveImpl implements ProductoService {
    @Autowired
    private ProductosDAO productosDAO;

    @Override
    public List<Productos> findAll() {
        return productosDAO.findAll();
    }

    @Override
    public List<Productos> findByAllCategoria(String categoria) {
        return productosDAO.findByAllCategoria(categoria);
    }

    @Override
    public Productos create(ProductoRequest productoRequest) {
        Productos productos = new Productos();
        productos.setNombreProducto(productoRequest.getNameProduct());
        productos.setDescripcion(productoRequest.getInformacion());
        productos.setPrecio(productoRequest.getPrice());
        productos.setStock(productoRequest.getCantidad());
        productos.setFechaCreacion(productoRequest.getDateCreation());
        productos.setFkCategoria(productoRequest.getFkcategory());
        productos.setFkProveedor((productoRequest.getFkdistribuidor()));
        return productosDAO.save(productos);
    }

    @Override
    public void delate(Integer idProducto) {
        productosDAO.deleteById(idProducto);
    }

    @Override
    public List<Productos> findByNombreProducto(String nombreProducto) {
        return productosDAO.findByNombreProducto(nombreProducto);
    }

    @Override
    public Productos update(Productos productos,Integer idProducto) {
        Optional<Productos> existe = productosDAO.findById(idProducto);
        if (existe.isPresent()){
            Productos productosUpdate = existe.get();
            productosUpdate.setNombreProducto(productos.getNombreProducto());
            productosUpdate.setDescripcion(productos.getDescripcion());
            productosUpdate.setFechaCreacion(productos.getFechaCreacion());
            productosUpdate.setPrecio(productos.getPrecio());
            productosUpdate.setStock(productos.getStock());
            productosUpdate.setFkCategoria(productos.getFkCategoria());
            productosUpdate.setFkProveedor(productos.getFkProveedor());
            return productosDAO.save(productosUpdate);
        }
        else {
            return null;
        }
    }

}
