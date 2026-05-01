package com.makeit.app.service;

import com.makeit.app.model.RetoCatalogo;
import com.makeit.app.repository.RetoCatalogoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class RetoCatalogoService {

    private final RetoCatalogoRepository retoCatalogoRepository;

    public RetoCatalogoService(RetoCatalogoRepository retoCatalogoRepository) {
        this.retoCatalogoRepository = retoCatalogoRepository;
    }

    public List<RetoCatalogo> obtenerRetosActivos() {
        return retoCatalogoRepository.findByActivoTrue();
    }

    public RetoCatalogo obtenerRetoAleatorio(Long categoriaId) {
        List<RetoCatalogo> retos = (categoriaId == null)
                ? retoCatalogoRepository.findByActivoTrue()
                : retoCatalogoRepository.findByCategoriaIdAndActivoTrue(categoriaId);

        if (retos.isEmpty()) {
            return null;
        }

        int indice = ThreadLocalRandom.current().nextInt(retos.size());
        return retos.get(indice);
    }
}
