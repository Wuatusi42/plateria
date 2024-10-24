package com.indexia.fullPlateria.model.repository;

import com.indexia.fullPlateria.model.entity.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedoresDAO extends JpaRepository<Proveedores,Integer> {

}
