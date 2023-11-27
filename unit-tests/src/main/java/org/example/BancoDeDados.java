package org.example;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger logger = Logger.getLogger(BancoDeDados.class.getName());

    public static void IniciarConexao() {
        logger.info("Iniciou conexão");

    }

    public static void finalizarConexao() {
        logger.info("Finalizou conexão");

    }

    public static void insereDados(Pessoa pessoa) {
        logger.info("Inseriu dados");
    }

    public static void removeDados(Pessoa pessoa) {
        logger.info("Removeu dados");
    }
}
