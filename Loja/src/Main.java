import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome da loja: ");
        String nome = sc.nextLine();  // Use nextLine para aceitar nomes com espaços
        Loja loja = new Loja(nome);

        int opcao;

        do {
            System.out.println("\n-------- Menu de opções --------");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Calcular valor em estoque");
            System.out.println("4 - Produto mais caro");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    sc.nextLine(); // consumir quebra de linha pendente
                    System.out.print("Nome do produto: ");
                    String nomeProd = sc.nextLine();

                    System.out.print("Preço do produto: ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade em estoque: ");
                    int qtd = sc.nextInt();

                    loja.addProduto(new Produto(nomeProd, preco, qtd));
                    break;

                case 2:
                    loja.listarProdutos();
                    break;

                case 3:
                    System.out.printf("O valor total do estoque é: R$ %.2f\n", loja.valorTotalEstoque());
                    break;

                case 4:
                    Produto caro = loja.produtoMaisCaro();
                    if (caro != null) {
                        System.out.println("O produto mais caro é: " + caro);
                    } else {
                        System.out.println("Nenhum produto cadastrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
