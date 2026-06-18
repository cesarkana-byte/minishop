package com.tecsup.minishop.controller;

import com.tecsup.minishop.service.ProductoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/producto/precio")
    public double obtenerPrecio() {
        return productoService.calcularPrecioConDescuento(1200.0);
    }
}
