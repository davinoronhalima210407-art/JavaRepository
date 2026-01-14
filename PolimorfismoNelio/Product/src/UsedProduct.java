import java.util.Date;

public class UsedProduct extends Product{
    protected Date manufactureDate;

    public UsedProduct(double price, String name, Date manufactureDate) {
        super(price, name);
        this.manufactureDate = manufactureDate;
    }
    @Override
    public String priceTag(){
        return name + "(used) $ " + price + " (Manufacture Date: " + manufactureDate + ")";
    }
}
