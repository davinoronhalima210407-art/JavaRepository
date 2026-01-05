import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<HourContract> contracts = new ArrayList<HourContract>();

        System.out.println("Enter departament's name: ");
        String departamentName = input.nextLine();
        System.out.println("Enter worker data: ");
        System.out.println("Name: " );
        String name = input.nextLine();
        System.out.println("Level: ");
        String level = input.nextLine();
        System.out.println("Base salary: ");
        double baseSalary = input.nextDouble();
        Worker worker = new Worker(name,WorkerLevel.valueOf(level),baseSalary, new Departament(departamentName));

        System.out.println("How many contracts to this worker? ");
        int numbersContracts = input.nextInt();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i < numbersContracts; i++) {
            System.out.println("Enter contract's " + (i + 1) + " data : ");
            System.out.println("Date (DD/MM/YYYY): ");
            Date date = sdf.parse(input.next());
            System.out.println("Value per hour: ");
            double valuePerHour = input.nextDouble();
            System.out.println("Duration (Hours): ");
            Integer hours = input.nextInt();
            HourContract contract = new HourContract(date,valuePerHour,hours);
            worker.addContract(contract);
        }
        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndyear = input.next();
        int month = Integer.parseInt(monthAndyear.substring(0, 2));
        int year = Integer.parseInt(monthAndyear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndyear + ": " + String.format("%.2f",worker.income(year,month)));
        input.close();
    }
}