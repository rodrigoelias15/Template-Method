public class Bitrem extends Caminhao{

    public String verificarAprovadoViajar() {
        if (this.calcularPesoBruto() <= 57) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

    @Override
    public String getTipo() {
        return "Caminhão Bitrem com até 9 eixos ";
    }
}
