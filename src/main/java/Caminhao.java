public abstract class Caminhao {
    private String nome;
    private String marca;
    private float pesoCarga;
    private float pesoCaminhao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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

    public abstract String verificarAprovadoViajar();

    public String getTipo() {
        return "Carro";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "nome=" + this.nome +
                ", marca='" + this.marca + '\'' +
                ", resultado=" + this.verificarAprovadoViajar() +
                '}';
    }

}
