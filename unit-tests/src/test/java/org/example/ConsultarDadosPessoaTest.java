package org.example;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosPessoaTest {


    @BeforeAll
    static void configurarConexao() {
        BancoDeDados.IniciarConexao();
    }

    @Test
    void validarDadosRetorno() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("Joao", LocalDate.now()));
    }

    @AfterEach
    void removeDadosParaTeste() {
        BancoDeDados.removeDados(new Pessoa("Joao", LocalDate.now()));
    }

}
