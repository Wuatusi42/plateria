package com.indexia.fullPlateria.controllers;


import com.indexia.fullPlateria.model.entity.Productos;
import com.indexia.fullPlateria.service.ProductoService;
import com.indexia.fullPlateria.utils.ProductoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/getAllProducto")
    public List<Productos> findAll() {
        List<Productos> productos = productoService.findAll();
        return productos;
    }

    @GetMapping("/categoriaProductos/{categoria}")
    public ResponseEntity<?> findByAllCategoria(@PathVariable String categoria) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productoService.findByAllCategoria(categoria));
        } catch (Exception e) {
            System.out.println("error" + e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.singletonList("Sin respuesta"));
        }
    }

    @GetMapping("/nombreProducto/{nombreProducto}")
    public ResponseEntity<?> findByNombreProducto(@PathVariable String nombreProducto) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productoService.findByNombreProducto(nombreProducto));
        } catch (Exception e) {
            System.out.println("error" + e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error");
        }

    }

    @PostMapping("/save")
    public ResponseEntity<?> create(@RequestBody ProductoRequest request) {
        try {
           Productos productoRequest = productoService.create(request);
            return ResponseEntity.status(HttpStatus.OK).body(request);
        } catch (Exception e) {
            System.out.println("error" + e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error");
        }
    }

    @PutMapping("/update/{idProducto}")
    public ResponseEntity<?> update(@RequestBody Productos productos,@PathVariable Integer idProducto) {
        try {
            Productos producto = productoService.update(productos, idProducto);
            return ResponseEntity.status(HttpStatus.OK).body(producto);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error"+e);
        }
    }

    @DeleteMapping("/delate/{idProducto}")
    public void delate(@PathVariable Integer idProducto) {
        try {
            productoService.delate(idProducto);
        } catch (Exception e) {
            System.out.println("error" + e);
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error");
        }
    }
}