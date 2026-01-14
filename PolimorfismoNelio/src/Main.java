import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Employee #" + i + " data: ");
            System.out.println("Outsourced (y/n)? ");
            char Outsourced = sc.next().charAt(0);
            if (Outsourced == 'y'){
                System.out.println("Name: ");
                String Name = sc.next();
                System.out.println("Hours: ");
                Integer hours = sc.nextInt();
                System.out.println("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                System.out.println("Additional charge: ");
                double addionalCharge = sc.nextDouble();
                Employee employee = new OutsourcedEmployee(Name, hours, valuePerHour,addionalCharge);
                employees.add(employee);
            }else {
                System.out.println("Name: ");
                String Name = sc.next();
                System.out.println("Hours: ");
                Integer hours = sc.nextInt();
                System.out.println("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                Employee employee = new Employee(Name, hours, valuePerHour);
                employees.add(employee);
            }
    }
        System.out.println("PAYMENTS: ");
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
}