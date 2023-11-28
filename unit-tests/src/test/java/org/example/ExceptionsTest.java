package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validarCenarioExececaoTransferenciaValor() {
        Conta contaOrigem = new Conta("1234", 0);
        Conta contaDestino = new Conta("4312", 100);

        TransferenciaEntreContas transferencia = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            transferencia.transfere(contaOrigem, contaDestino, -1);
        });

    }

    @Test
    void validaCenarioCorretoTransferencia() {
        Conta contaOrigem = new Conta("1234", 0);
        Conta contaDestino = new Conta("4312", 100);

        TransferenciaEntreContas transferencia = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() -> {
            transferencia.transfere(contaOrigem, contaDestino, 20);
        });

    }


}
