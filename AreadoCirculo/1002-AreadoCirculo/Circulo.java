class Circulo {

    private double raio;
    private static final double PI = 3.14159;
    private double area;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public void CalcularArea(){
        area = Math.pow(raio,2)*PI;
    }
    public void exibirinfo(){
        System.out.printf("A=%.4f%n",area);
    }
}
