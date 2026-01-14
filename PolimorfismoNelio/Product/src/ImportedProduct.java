public class ImportedProduct extends Product{
    protected double customFee;

    public ImportedProduct(double price, String name, double customFee) {
        super(price, name);
        this.customFee = customFee;
    }
    public double totalPrice(){
        return price+customFee;
    }
    @Override
    public String priceTag(){
        return name + " $ " + totalPrice() + " (Customs fee: $ " + customFee + ")";
    }
}
