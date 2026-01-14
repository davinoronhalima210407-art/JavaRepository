public abstract class TaxPayer {
    protected String name;
    protected double anualIncome;

    public TaxPayer(String name, double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public TaxPayer() {
    }

    public String getName() {
        return name;
    }

    public double getAnualIncome() {
        return anualIncome;
    }

    public abstract double tax();

}
