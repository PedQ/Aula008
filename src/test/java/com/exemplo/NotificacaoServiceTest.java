package com.exemplo;

import main.com.exemplo.NotificacaoService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoServiceTest {

    private final NotificacaoService service =
            new NotificacaoService();

    @Test
    void deveAceitarEmailValido() {
        assertTrue(
                service.validarEmail("teste@gmail.com")
        );
    }

    @Test
    void deveRejeitarEmailInvalido() {
        assertFalse(
                service.validarEmail("teste-invalido")
        );
    }
}