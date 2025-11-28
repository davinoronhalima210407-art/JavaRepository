import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numero = new int[10];

        for (int i = 0; i < numero.length; i++) {
            while (true){
                try {
                    System.out.println("Número "+(i+1)+" : ");
                    numero[i] = input.nextInt();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("Error: Somente números!");
                    input.nextLine();
                }
            }
        }
        while(true) {
            int[] indice = new int[2];
            try{
            System.out.println("Escolha a operação (digite o número): ");
                System.out.println("1 - Somar 2 índices");
                System.out.println("2 - Dividir um índice por outro");
                System.out.println("3 - Elevar um índice a potência");
                System.out.println("4 - Mostra elemento do vetor");
                System.out.println("5 - Alterar valor do vetor");
                System.out.println("-1 - Fechar o programa");
            int operacao = input.nextInt();
            if (operacao == -1){
                System.out.println("Programa fechado.");
                break;
            }
            if (operacao == 1){
                System.out.println("Qual o índice do primeiro valor?");
                indice[0] = input.nextInt();
                System.out.println("Qual o índice do segundo valor?");
                indice[1] = input.nextInt();
                int resultado = numero[indice[0]]+numero[indice[1]];
                System.out.println("Resultado: "+resultado);
            }if (operacao == 2){
                    System.out.println("Qual o índice do primeiro valor?");
                    indice[0] = input.nextInt();
                    System.out.println("Qual o índice do segundo valor?");
                    indice[1] = input.nextInt();
                    int resultado = numero[indice[0]]/numero[indice[1]];
                    System.out.println("Resultado: "+resultado);
            }if (operacao == 3){
                    System.out.println("Qual o índice do número a ser elevado: ");
                    indice[0] = input.nextInt();
                    System.out.println("Qual a potência? ");
                    int potencia = input.nextInt();
                    System.out.println("Resultado: "+Math.pow(numero[indice[0]],potencia));
            }if (operacao == 4){
                    System.out.println("Selecione um índice: ");
                    indice[0] = input.nextInt();
                    System.out.println("Resultado: "+numero[indice[0]]);
            }if (operacao == 5){
                    System.out.println("Qual índice você deseja alterar? ");
                    indice[0] = input.nextInt();
                    System.out.println("Qual valor esse índice vai receber? ");
                    int valor = input.nextInt();
                    numero[indice[0]] = valor;
                    System.out.println("Resultado: "+numero[indice[0]]);
                }
            else {
                    System.out.println("Digite um número do cardápio");
                }
        }catch (InputMismatchException e){
                System.out.println("Error: Somente números!");
                input.nextLine();
            }catch (ArithmeticException e){
                System.out.println("Error: O número não pode ser dividido por 0");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Error: O número não pode está fora do índice");
            }finally {
                System.out.println("Operação finalizada!");
            }
        }
    }
}