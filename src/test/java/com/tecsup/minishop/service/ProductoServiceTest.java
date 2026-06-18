package com.tecsup.minishop.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductoServiceTest {

    @Test
    void calcularPrecioConDescuento() {
        ProductoService service = new ProductoService();

        double resultado = service.calcularPrecioConDescuento(1200.0);

        assertEquals(1080.0, resultado);
    }

    @Test
    void calcularPrecioSinDescuento() {
        ProductoService service = new ProductoService();

        double resultado = service.calcularPrecioConDescuento(500.0);

        assertEquals(500.0, resultado);
    }
}
