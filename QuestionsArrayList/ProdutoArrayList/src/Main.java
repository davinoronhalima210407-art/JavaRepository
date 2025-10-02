import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos produtos deseja cadastrar? ");
        int qnt =  input.nextInt();

        ArrayList<Produto> produtos = new ArrayList<Produto>();
        input.nextLine();
        double somador = 0;

        for(int i = 0;i<qnt;i++){
            System.out.println("Produto "+ (i+1));
            System.out.println("Nome do produto: ");
            String nome = input.next();
            System.out.println("Preco do produto: ");
            double preco = input.nextDouble();
            produtos.add(new Produto(nome,preco));

            somador += produtos.get(i).getPreco();
        }
            Produto maiorPreco = produtos.get(0);
            double media = somador/produtos.size();


        for(int i = 0;i<produtos.size();i++){
            if(produtos.get(i).getPreco() > maiorPreco.getPreco()){
                maiorPreco = produtos.get(i);
            }
        }

        System.out.println("Produto mais caro: " + maiorPreco.getNome()+ ", valor: "+ maiorPreco.getPreco());
        System.out.println("Média: "+media);
    }
}