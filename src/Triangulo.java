public class Triangulo {

    private double ladoA;

    private double ladoB;

    private double ladoC;

    private double p;

    private double area;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public void CalcularSemiPerimetro(){
        p = (ladoA + ladoB + ladoC) / 2;
        System.out.println("o semiperimetro é: " + p);
    }

    public void CalcularArea(){
        area = Math.sqrt(p* (p-ladoA) *(p-ladoB)*(p-ladoC));
        System.out.println("A área é: " + area);
    }
}
