package com.indexia.fullPlateria.controllers;

import com.indexia.fullPlateria.model.entity.Productos;
import com.indexia.fullPlateria.model.entity.Usuarios;
import com.indexia.fullPlateria.model.repository.ProductosDAO;
import com.indexia.fullPlateria.model.repository.UsuariosDAO;
import com.indexia.fullPlateria.service.UsuariosService;
import com.indexia.fullPlateria.utils.UsuariosRequest;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    @Autowired
    private UsuariosService usuariosService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody UsuariosRequest request) {
        try {
            Usuarios usuario = usuariosService.create(request);
            return ResponseEntity.status(HttpStatus.OK).body(usuario);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error" + e);
        }
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {
        List<Usuarios> usuariosList = usuariosService.findAll();
        try {
            return ResponseEntity.status(HttpStatus.OK).body(usuariosList);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error" + e);
        }
    }

    @PutMapping("/update/{idUsuario}")
    public ResponseEntity<?> update(@PathVariable Integer idUsuario, @RequestBody Usuarios usuario) {
        Usuarios usuariosUpdate = usuariosService.update(idUsuario, usuario);
        try {
            return ResponseEntity.status(HttpStatus.OK).body(usuariosUpdate);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error" + e);
        }
    }

    @PatchMapping("/patch/{idUsuario}")
    public ResponseEntity<?> updatePatch(@PathVariable Integer idUsuario, @RequestBody Usuarios usuario) {
        Usuarios usuariosPatch = usuariosService.updatePatch(idUsuario, usuario);
        try {
            return ResponseEntity.status(HttpStatus.OK).body(usuariosPatch);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error" + e);
        }
    }

    @DeleteMapping("/delate/{idUsuario}")
    public void delate(@PathVariable Integer idUsuario) {
        usuariosService.delate(idUsuario);
    }
}

