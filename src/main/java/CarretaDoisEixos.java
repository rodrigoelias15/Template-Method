public class CarretaDoisEixos extends Caminhao {

    public String verificarAprovadoParaViajar() {
        if (this.calcularPesoBruto() <= 33) {
            return "Aprovado para viajar";
        }
        else {
            return "Reprovado para viajar";
        }
    }
}
