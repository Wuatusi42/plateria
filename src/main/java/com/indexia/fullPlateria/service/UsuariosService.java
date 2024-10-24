package com.indexia.fullPlateria.service;

import com.indexia.fullPlateria.model.entity.Usuarios;
import com.indexia.fullPlateria.utils.UsuariosRequest;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface UsuariosService{
    public Usuarios create(UsuariosRequest usuariosRequest);
    public List<Usuarios> findAll();
    public Usuarios update(Integer idUsuario, Usuarios usuarios);
    public Usuarios updatePatch(Integer idUsuario, Usuarios usuarios);
    public void delate(Integer idUsuario);
}
