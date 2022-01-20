import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitremTest {

    @Test
    void deveRetonarAprovado() {
        Bitrem caminhao = new Bitrem();
        caminhao.setPesoCaminhao(20);
        caminhao.setPesoCarga(22);
        assertEquals("Aprovado para viajar", caminhao.verificarAprovadoParaViajar());
    }

    @Test
    void deveRetonarReprovado() {
        Bitrem caminhao = new Bitrem();
        caminhao.setPesoCaminhao(20);
        caminhao.setPesoCarga(39);
        assertEquals("Reprovado para viajar", caminhao.verificarAprovadoParaViajar());
    }

    @Test
    void deveRetornarInformacoes() {
        Bitrem caminhao = new Bitrem();
        caminhao.setPesoCaminhao(20);
        caminhao.setPesoCarga(30);
        caminhao.setMarca("Scania");
        assertEquals("Caminhão Bitrem com até 9 eixos {marca='Scania', resultado=Aprovado para viajar}", caminhao.getInfo());
    }
}