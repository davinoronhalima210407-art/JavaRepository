public abstract class Veiculo implements Tributavel {
        protected String modelo;
        protected double valorMercado;

    public Veiculo(String modelo,double valorMercado) {
        this.modelo = modelo;
        this.valorMercado = valorMercado;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", valorMercado=" + valorMercado +
                '}';
    }
}
