public class Triangle {

    private double ladoa;
    private double ladob;
    private double ladoc;
    private double area;

    public Triangle(double ladoa, double ladob, double ladoc) {
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.ladoc = ladoc;
    }

    public double getLadoa() {
        return ladoa;
    }

    public void setLadoa(double ladoa) {
        this.ladoa = ladoa;
    }

    public double getLadob() {
        return ladob;
    }

    public void setLadob(double ladob) {
        this.ladob = ladob;
    }

    public double getLadoc() {
        return ladoc;
    }

    public void setLadoc(double ladoc) {
        this.ladoc = ladoc;
    }
    public void FormulaHeron(double ladoa, double ladob, double ladoc) {
        double p = (ladoa+ladob+ladoc)/2;
        area = Math.sqrt(p*(p-ladoa)*(p-ladob)*(p-ladoc));
    }
    @Override
    public String toString() {
       return "Triangle Area: " + area;
    }
}
