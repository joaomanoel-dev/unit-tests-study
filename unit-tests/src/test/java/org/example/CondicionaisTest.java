package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;



public class CondicionaisTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "joaom")
    void validarAlgoSomenteNoUsuarioLogadoX() {
        Assertions.assertTrue(true);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarSeSistemaOperacional() {
        Assertions.assertTrue(true);
    }

    @Test
    @EnabledOnOs({OS.WINDOWS, OS.LINUX})
    void validarSeSistemaOperacionais() {
        Assertions.assertTrue(true);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void validarSeJava17() {
        Assertions.assertTrue(true);
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_11, max = JRE.JAVA_17)
    void validarSeRangeJre() {
        Assertions.assertTrue(true);
    }


}
