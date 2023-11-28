package org.example;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrdemTest {

    @Order(4)
    @Test
    void fluxoA() {
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void fluxoB() {
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void fluxoC() {
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void fluxoD() {
        Assertions.assertTrue(true);
    }
}
