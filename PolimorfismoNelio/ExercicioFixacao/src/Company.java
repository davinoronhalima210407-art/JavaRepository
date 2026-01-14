public class Company extends TaxPayer{
    protected Integer numberOfEmployees;

    public Company(String name, double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }
    @Override
    public double tax(){
        if(numberOfEmployees <= 10){
            anualIncome = anualIncome * 0.16;
        }
        else{
            anualIncome = anualIncome * 0.14;
        }
        return anualIncome;
    }
}
