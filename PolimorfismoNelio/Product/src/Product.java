public class Product {
    protected String name;
    protected double price;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }
    public String priceTag(){
        return name + " $ " + price;
    }
}
