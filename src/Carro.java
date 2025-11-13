public class Carro extends Veiculo{
    private int potenciaCV;

    public Carro(String modelo, double valorMercado, int potenciaCV) {
        super(modelo, valorMercado);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    @Override
    public double calcularImposto() {
        double ipva = 0;
        if (potenciaCV <= 100) {
            ipva = valorMercado * 2.5 / 100;
        } else if (potenciaCV <= 180) {
            ipva = valorMercado * 3.0 / 100;
        }else{
            ipva = valorMercado * 3.5 / 100;
        }
        return ipva;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "potenciaCV=" + potenciaCV +
                ", modelo='" + modelo + '\'' +
                ", valorMercado=" + valorMercado +
                '}';
    }
}
