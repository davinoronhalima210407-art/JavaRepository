import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int in = 0;
        int out = 0;
        int X = 0;
        for(int i = 0; i < N; i++){
            X = sc.nextInt();
            if(X <= 20 && X>=10){
                in++;
            }
            else{
                out++;
            }
        }
        System.out.printf("%d in\n%d out\n", in, out);
    }
}