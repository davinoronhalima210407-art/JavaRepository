import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Banco account = null;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder name: ");
        String holder = sc.next();
        System.out.println("Is there na initial deposit? y/n ");
        char yesorno = sc.next().charAt(0);
        if(yesorno == 'y'){
            System.out.println("Enter deposit amount: ");
            double initialdeposit = sc.nextDouble();
            account = new Banco(number,holder,initialdeposit);
        }else if(yesorno == 'n'){
            account = new Banco(number,holder);
        }

        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println("Enter a depostit value: ");
        double depositvalue = sc.nextDouble();
        account.depositValue(depositvalue);
        System.out.println("Update account data: ");
        System.out.println(account);

        System.out.println("Enter a withdraw value: ");
        double withdrawvalue = sc.nextDouble();
        account.withdrawValue(withdrawvalue);
        System.out.println("Update account data: ");
        System.out.println(account);

        sc.close();
    }
}