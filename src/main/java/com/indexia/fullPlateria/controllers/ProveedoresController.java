package com.indexia.fullPlateria.controllers;

import com.indexia.fullPlateria.model.entity.Proveedores;
import com.indexia.fullPlateria.service.ProveedoresService;
import com.indexia.fullPlateria.utils.ProveedoresRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proveedor")
public class ProveedoresController {
    @Autowired
    private ProveedoresService proveedoresService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody ProveedoresRequest request) {
        try {
            Proveedores proveedorRequest = proveedoresService.create(request);
            return ResponseEntity.status(HttpStatus.OK).body(proveedorRequest);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error" + e);
        }
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Proveedores>> findAll() {
        List<Proveedores> proveedoresList = proveedoresService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(proveedoresList);
    }
    @PutMapping("/update/{idProveedor}")
    public ResponseEntity<?> update(@PathVariable Integer idProveedor,@RequestBody Proveedores  proveedorUpdate){
        Proveedores proveedores = proveedoresService.update(idProveedor, proveedorUpdate);
        try {
            return ResponseEntity.status(HttpStatus.OK).body(proveedores);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error" + e);
        }
    }
    @DeleteMapping("/delate/{idProveedores}")
    public void delate(@PathVariable Integer idProveedores){
        try {
            proveedoresService.delate(idProveedores);
        }catch (Exception e){
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error"+e);
        }
    }
    @PatchMapping("/patch/{idProveedor}")
    public ResponseEntity<?> pathProveedor(@PathVariable Integer idProveedor, @RequestBody Proveedores proveedorPath){
        Proveedores proveedorePU = proveedoresService.pathProveedor(idProveedor, proveedorPath);
        try {
           return ResponseEntity.status(HttpStatus.OK).body(proveedorePU);
        }catch (Exception e){
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error"+e);
        }
    }
}