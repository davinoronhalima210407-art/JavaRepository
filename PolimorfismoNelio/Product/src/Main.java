import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        List<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the numbers of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter product #" + i + " data: ");
            System.out.println("Common, used or imported (c/u/i)? ");
            char kind = sc.next().charAt(0);
            if (kind == 'c') {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Price: ");
                double price = sc.nextDouble();
                Product product = new Product(price,name);
                products.add(product);
            }else if (kind == 'u') {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Price: ");
                double price = sc.nextDouble();
                System.out.println("Manufacture Date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                Product product = new UsedProduct(price,name,manufactureDate);
                products.add(product);
            }else if (kind == 'i') {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Price: ");
                double price = sc.nextDouble();
                System.out.println("Customs fee: ");
                double customsFee = sc.nextDouble();
                Product product = new ImportedProduct(price,name,customsFee);
                products.add(product);
            }
        }
        System.out.println("PRICE TAGS: ");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }
    }
}