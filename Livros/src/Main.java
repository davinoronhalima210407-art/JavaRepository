import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o nome da biblioteca? ");
        String nomeBiblioteca = input.nextLine();
        Catalogo biblioteca = new Catalogo(nomeBiblioteca);

        System.out.println("Deseja adicionar livros a coleção? s/n ");
        char opcao =  input.next().charAt(0);

        while(opcao == 's'){
            input.nextLine();
            System.out.println("Nome do livro: ");
            String nomeLivro = input.nextLine();
            System.out.println("Autor do livro: ");
            String autorLivro = input.nextLine();
            System.out.println("Quantas páginas: ");
            int paginasLivro = input.nextInt();

            biblioteca.adicionarLivros(new Livros(nomeLivro, autorLivro, paginasLivro));

            System.out.println("Deseja adicionar mais um livro? s/n ");
            opcao =  input.next().charAt(0);
        }
        biblioteca.listarLivros();
    }
}