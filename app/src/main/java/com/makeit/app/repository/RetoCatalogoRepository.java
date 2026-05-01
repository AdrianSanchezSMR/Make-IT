package com.makeit.app.repository;

import com.makeit.app.model.RetoCatalogo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RetoCatalogoRepository extends JpaRepository<RetoCatalogo, Long> {
    List<RetoCatalogo> findByActivoTrue();
    List<RetoCatalogo> findByCategoriaIdAndActivoTrue(Long categoriaId);
}
