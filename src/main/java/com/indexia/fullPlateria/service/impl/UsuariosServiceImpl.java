package com.indexia.fullPlateria.service.impl;

import com.indexia.fullPlateria.model.entity.Proveedores;
import com.indexia.fullPlateria.model.entity.Usuarios;
import com.indexia.fullPlateria.model.repository.UsuariosDAO;
import com.indexia.fullPlateria.service.UsuariosService;
import com.indexia.fullPlateria.utils.UsuariosRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosServiceImpl implements UsuariosService {
    @Autowired
    private UsuariosDAO usuariosDAO;
    @Override
    public Usuarios create(UsuariosRequest usuariosRequest) {
        Usuarios usuario = new Usuarios();
        usuario.setNombreUsuario(usuariosRequest.getNameUser());
        usuario.setDireccion(usuariosRequest.getUbicasion());
        usuario.setTelefono(usuariosRequest.getPhone());
        usuario.setEmail(usuariosRequest.getCorreo());
        usuario.setPassword(usuariosRequest.getConstrasena());
        usuario.setFechaRegistro(usuariosRequest.getDateRegister());
        usuario.setFkRol(usuariosRequest.getRolFk());
        return usuariosDAO.save(usuario);
    }

    @Override
    public List<Usuarios> findAll() {
        return usuariosDAO.findAll();
    }

    @Override
    public Usuarios update(Integer idUsuario, Usuarios usuarios) {
        Optional<Usuarios> existe = usuariosDAO.findById(idUsuario);
        if (existe.isPresent()){
            Usuarios usuarioUpdate = existe.get();
            usuarioUpdate.setNombreUsuario(usuarios.getNombreUsuario());
            usuarioUpdate.setDireccion(usuarios.getDireccion());
            usuarioUpdate.setEmail(usuarios.getEmail());
            usuarioUpdate.setTelefono(usuarios.getTelefono());
            usuarioUpdate.setPassword(usuarios.getPassword());
            usuarioUpdate.setFkRol(usuarios.getFkRol());
            return usuariosDAO.save(usuarioUpdate);
        }
        else {
            return null;
        }
    }

    @Override
    public Usuarios updatePatch(Integer idUsuario, Usuarios usuarios) {
        Optional<Usuarios> existe = usuariosDAO.findById(idUsuario);
        if (existe.isPresent()){
            Usuarios usuarioUP = existe.get();
            if (usuarios.getNombreUsuario() != null){
                usuarioUP.setNombreUsuario(usuarios.getNombreUsuario());
            }
            if (usuarios.getDireccion() != null){
                usuarioUP.setDireccion(usuarios.getDireccion());
            }
            if (usuarios.getPassword() != null){
                usuarioUP.setPassword(usuarios.getPassword());
            }
            if (usuarios.getEmail() != null){
                usuarioUP.setEmail(usuarios.getEmail());
            }
            if (usuarios.getFechaRegistro() != null){
                usuarioUP.setFechaRegistro(usuarios.getFechaRegistro());
            }
            if (usuarios.getTelefono() != null){
                usuarioUP.setTelefono(usuarios.getTelefono());
            }
            if (usuarios.getFkRol() != null){
                usuarioUP.setFkRol(usuarios.getFkRol());
            }
            return usuariosDAO.save(usuarioUP);
        }
        return null;
    }

    @Override
    public void delate(Integer idUsuario) {
        usuariosDAO.deleteById(idUsuario);
    }
}
