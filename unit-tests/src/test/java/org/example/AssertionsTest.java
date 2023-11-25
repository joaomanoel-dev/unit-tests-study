package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AssertionsTest {

    @Test
    void validarLancamentos() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;
        assertNull(pessoa);

        Pessoa pessoa1 = new Pessoa("Joao", LocalDate.now());
        assertNotNull(pessoa1);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }

}