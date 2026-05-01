package com.makeit.app.controller;

import com.makeit.app.model.RetoCatalogo;
import com.makeit.app.service.RetoCatalogoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/retos")
public class RetoCatalogoController {

    private final RetoCatalogoService retoCatalogoService;

    public RetoCatalogoController(RetoCatalogoService retoCatalogoService) {
        this.retoCatalogoService = retoCatalogoService;
    }

    @GetMapping
    public List<RetoCatalogo> listarActivos() {
        return retoCatalogoService.obtenerRetosActivos();
    }

    @GetMapping("/aleatorio")
    public ResponseEntity<RetoCatalogo> obtenerRetoAleatorio(
            @RequestParam(required = false) Long categoriaId
    ) {
        RetoCatalogo reto = retoCatalogoService.obtenerRetoAleatorio(categoriaId);
        if (reto == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(reto);
    }
}
