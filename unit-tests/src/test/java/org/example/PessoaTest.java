package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PessoaTest {

    @Test
    void validarCalculoPessoa() {
        Pessoa pessoa = new Pessoa("julia", LocalDate.of(2020, 1, 1));
        Assertions.assertEquals(3, pessoa.getIdade());
    }


}