import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        System.out.println("Name: ");
        funcionario.Name = input.nextLine();
        System.out.println("Gross salary: ");
        funcionario.GrossSalary  = input.nextDouble();
        System.out.println("Tax: ");
        funcionario.Tax = input.nextDouble();

        System.out.println("Employee: " + (funcionario.Name)+ ", " +funcionario.NetSalary());
        input.nextLine();
        System.out.println("Which percentage to increase salary? ");
        double percentage = input.nextDouble();
        System.out.println("Update data: "+funcionario.Name +", "+funcionario.increaseSalary(percentage) );
        input.close();
    }
}