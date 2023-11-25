package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PessoaTest {

    final Pessoa pessoa = new Pessoa("Jessica", LocalDate.of(2000, 1, 1));

    @Test
    void validarCalculoPessoa() {
        Assertions.assertEquals(23, pessoa.getIdade());
    }

    @Test
    void deveRetornarSeMaiorDeIdade() {
        Assertions.assertTrue(pessoa.maiorDeIdade());

        Pessoa joao = new Pessoa("Joao", LocalDate.now());
        Assertions.assertFalse(joao.maiorDeIdade());

    }


}