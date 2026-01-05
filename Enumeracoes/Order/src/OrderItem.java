public class OrderItem {
    private Integer quantity;
    private double price;

    private Product product;

    public OrderItem() {
    }

    public OrderItem(Product product, Integer quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double subTotal(){
        return price * quantity;
    }
}
