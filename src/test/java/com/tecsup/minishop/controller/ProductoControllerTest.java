package com.tecsup.minishop.controller;

import com.tecsup.minishop.service.ProductoService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductoControllerTest {

    @Test
    void obtenerPrecioConDescuento() {
        ProductoService service = new ProductoService();
        ProductoController controller = new ProductoController(service);

        double resultado = controller.obtenerPrecio();

        assertEquals(1080.0, resultado);
    }
}
