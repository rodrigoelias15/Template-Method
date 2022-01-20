public class Bitrem extends Caminhao{

    public String verificarAprovadoParaViajar() {
        if (this.calcularPesoBruto() <= 57) {
            return "Aprovado para viajar";
        }
        else {
            return "Reprovado para viajar";
        }
    }

    @Override
    public String getTipo() {
        return "Caminhão Bitrem com até 9 eixos ";
    }
}
