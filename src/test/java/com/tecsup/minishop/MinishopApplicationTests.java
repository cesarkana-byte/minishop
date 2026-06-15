package com.tecsup.minishop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MinishopApplicationTests {

    private static final String MENSAJE_PRUEBA = "La aplicacion carga correctamente";

    @Test
    void contextLoads() {
        System.out.println(MENSAJE_PRUEBA);
    }

}