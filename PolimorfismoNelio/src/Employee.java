public class Employee {
    protected String name;
    protected Integer hours;
    protected double valuePerHour;

    public Employee() {
    }

    public Employee(String name, Integer hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }
    public double payment(){
        return hours * valuePerHour;
    }

    @Override
    public String toString() {
        return name + " - " + payment() ;
    }
}
