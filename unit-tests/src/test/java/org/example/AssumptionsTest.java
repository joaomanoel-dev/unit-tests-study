package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {

    @Test
    void validarAlgoSomenteNoUsuarioLogadoX() {
        Assumptions.assumeTrue("joaom".equals(System.getenv("USERNAME")));
        Assertions.assertTrue(true);
    }


}
