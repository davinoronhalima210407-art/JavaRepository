public class OutsourcedEmployee extends Employee {
    protected  double additionalChange;

    public OutsourcedEmployee(String name, Integer hours, double valuePerHour,double additionalChange) {
        super(name, hours, valuePerHour);
        this.additionalChange = additionalChange*1.1;
    }

    @Override
    public double payment(){
        return hours * valuePerHour+additionalChange;
    }
    @Override
    public String toString() {
        return name + " - " + payment() ;
    }
}
