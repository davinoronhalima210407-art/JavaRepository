import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.println("Individual or Company (i/c): ");
            char ch = sc.next().charAt(0);
            if (ch == 'i') {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.println("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                TaxPayer individual = new Individual(name, anualIncome, healthExpenditures);
                list.add(individual);
            }else if (ch == 'c') {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.println("Numbers of Employees: ");
                Integer numbersOfEmployees = sc.nextInt();
                TaxPayer company = new Company(name,anualIncome,numbersOfEmployees);
                list.add(company);
            }
        }
        System.out.println("TAXES PAID: ");
        double sum = 0;
        for (TaxPayer taxPayer : list) {
            taxPayer.tax();
            System.out.println(taxPayer.name + " : "+ "$ " + taxPayer.anualIncome);
            sum+= taxPayer.anualIncome;
        }
        System.out.println("TOTAL TAXES:  " + sum);
    }
}