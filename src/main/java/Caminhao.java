public abstract class Caminhao {
    private String marca;
    private float pesoCarga;
    private float pesoCaminhao;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(float pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public float getPesoCaminhao() {
        return pesoCaminhao;
    }

    public void setPesoCaminhao(float pesoCaminhao) {
        this.pesoCaminhao = pesoCaminhao;
    }

    public float calcularPesoBruto() {
        return (this.pesoCarga + this.pesoCaminhao);
    }

    public abstract String verificarAprovadoParaViajar();

    public String getTipo() {
        return "Caminhao";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "marca='" + this.marca + '\'' +
                ", resultado=" + this.verificarAprovadoParaViajar() +
                '}';
    }

}
