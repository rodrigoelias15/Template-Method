public class CarretaDoisEixos extends Caminhao {

    public String verificarAprovadoViajar() {
        if (this.calcularPesoBruto() <= 33) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }
}
