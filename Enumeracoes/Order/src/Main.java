import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter client data: ");
        System.out.println("Name: ");
        String name = input.nextLine();
        System.out.println("Email: ");
        String email = input.nextLine();
        System.out.println("Birth date(DD/MM/YYYY): ");
        Date date = sdf.parse(input.nextLine());
        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        String status = input.nextLine();
        System.out.println("How many items to this order: ");
        int quantity = input.nextInt();
        Date actuallyDate = new Date();
        Client client = new Client(name, email,date);
        Order order = new Order(actuallyDate, OrderStatus.valueOf(status));


        for(int i = 0; i < quantity; i++){

            System.out.println("Enter " + (i+1) + " item data: " );
            System.out.println("Product name: " );
            String productName = input.next();
            System.out.println("Product price: " );
            double productPrice = input.nextDouble();
            System.out.println("Product quantity: " );
            Integer productQuantity = input.nextInt();

            Product product = new Product(productName);
            OrderItem item = new OrderItem(product, productQuantity, productPrice);
            order.addItem(item);
        }
        System.out.println("ORDER SUMMARY: ");
        System.out.println("Order moment: " + sdf2.format(actuallyDate));
        System.out.println("Order status: " + status);
        System.out.println("Client: "+ client.getName() + " (" + sdf.format(client.getBirthDate()) + ") - " + client.getEmail() );
        System.out.println("Order items: ");
        for (OrderItem item : order.getItens()){
            System.out.println(
                    item.getProduct().getName() +
                            ", $" + item.getPrice() +
                            ", Quantity: " + item.getQuantity() +
                            ", Subtotal: $" + item.subTotal());
        }
        }
    }
