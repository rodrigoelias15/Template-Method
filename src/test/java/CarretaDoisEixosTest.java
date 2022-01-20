import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarretaDoisEixosTest {

    @Test
    void deveRetonarAprovadoParaViajar() {
        CarretaDoisEixos caminhao = new CarretaDoisEixos();
        caminhao.setPesoCaminhao(15);
        caminhao.setPesoCarga(10);
        assertEquals("Aprovado para viajar", caminhao.verificarAprovadoParaViajar());
    }

    @Test
    void deveRetonarReprovadoParaViajar() {
        CarretaDoisEixos caminhao = new CarretaDoisEixos();
        caminhao.setPesoCaminhao(15);
        caminhao.setPesoCarga(20);
        assertEquals("Reprovado para viajar", caminhao.verificarAprovadoParaViajar());
    }

    @Test
    void deveRetornarInformacoes() {
        CarretaDoisEixos caminhao = new CarretaDoisEixos();
        caminhao.setPesoCaminhao(15);
        caminhao.setPesoCarga(25);
        caminhao.setMarca("Volvo");
        assertEquals("Caminhao{marca='Volvo', resultado=Reprovado para viajar}",
                caminhao.getInfo());
    }
}