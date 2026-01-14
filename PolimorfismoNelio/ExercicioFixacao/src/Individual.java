public class Individual extends TaxPayer {
    protected double heathExpenditures;

    public Individual(String name, double anualIncome, double heathExpenditures) {
        super(name, anualIncome);
        this.heathExpenditures = heathExpenditures;
    }

    @Override
    public double tax() {
        if (this.heathExpenditures > 0) {
            anualIncome = (anualIncome * 0.25) - (heathExpenditures * 0.5);
        } else {
            if (this.anualIncome < 20000.00) {
                anualIncome = anualIncome * 0.15;
            } else if (this.anualIncome >= 20000.00) {
                anualIncome = anualIncome * 0.25;
            }
        }
        return anualIncome;
    }
}
