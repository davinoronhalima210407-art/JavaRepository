public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(String modelo, double valorMercado, int potenciaCV) {
        super(modelo, valorMercado);
        this.cilindrada = cilindrada;
    }

    public int getcilindrada() {
        return cilindrada;
    }

    @Override
    public double calcularImposto() {
        double ipva = 0;
        if (cilindrada <= 100) {
            ipva = valorMercado * 2.5 / 100;
        } else if (cilindrada <= 180) {
            ipva = valorMercado * 3.0 / 100;
        }else{
            ipva = valorMercado * 3.5 / 100;
        }
        return ipva;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "potenciaCV=" + cilindrada +
                ", modelo='" + modelo + '\'' +
                ", valorMercado=" + valorMercado +
                '}';
    }
}

