package com.tecsup.minishop.service;

import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    private static final double PRECIO_MINIMO_DESCUENTO = 1000.0;

    public double calcularPrecioConDescuento(double precio) {
        if (precio > PRECIO_MINIMO_DESCUENTO) {
            return precio * 0.90;
        }
        return precio;
    }
}
