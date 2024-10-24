package com.indexia.fullPlateria.model.repository;

import com.indexia.fullPlateria.model.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosDAO extends JpaRepository<Usuarios,Integer> {
}
