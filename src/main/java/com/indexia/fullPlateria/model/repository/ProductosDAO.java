package com.indexia.fullPlateria.model.repository;

import com.indexia.fullPlateria.model.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface ProductosDAO extends JpaRepository<Productos, Integer> {
@Query(value = "SELECT * FROM productos INNER JOIN categorias ON productos.fk_categoria = categorias.id_categoria where categorias.categoria =:categorias",nativeQuery = true)
    List<Productos> findByAllCategoria(@Param("categorias") String categoria);

List<Productos> findByNombreProducto(String nombreProducto);
}
