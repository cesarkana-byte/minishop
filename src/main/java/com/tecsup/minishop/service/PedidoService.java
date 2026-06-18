package com.tecsup.minishop.service;

import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    public double calcularTotal(double precio, int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero");
        }
        return precio * cantidad;
    }
}
