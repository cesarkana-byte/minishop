package com.tecsup.minishop.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PedidoServiceTest {

    @Test
    void calcularTotalCorrectamente() {
        PedidoService service = new PedidoService();

        double resultado = service.calcularTotal(50.0, 3);

        assertEquals(150.0, resultado);
    }

    @Test
    void lanzarErrorCuandoCantidadEsCero() {
        PedidoService service = new PedidoService();

        assertThrows(IllegalArgumentException.class, () -> service.calcularTotal(50.0, 0));
    }
}
