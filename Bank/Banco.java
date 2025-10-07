public class Banco {

    private int number;
    private String holder;
    private double value;

    public Banco(int number,String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Banco(int number, String holder, double initialdeposit) {
            this.number = number;
            this.holder = holder;
            depositValue(initialdeposit);

    }
    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public void depositValue(double amount) {
        value+= amount;
    }
    public void withdrawValue(double amount) {
        value-=amount +5.0;
    }

    @Override
    public String toString() {
        return "account data:\n"+"Account number: "+number+
        ", Account holder: "+ holder+String.format(", Balance: %.2f", value);
    }
}
