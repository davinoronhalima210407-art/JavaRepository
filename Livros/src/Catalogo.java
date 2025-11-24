import java.util.ArrayList;

public class Catalogo {
    ArrayList<Livros> livros = new ArrayList<Livros>();
    private String nomeBiblioteca;

    public Catalogo(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public void adicionarLivros(Livros livro){
        livros.add(livro);
    }
    public void listarLivros(){
        for(Livros livro : livros){
            System.out.println(livro);
        }
    }
}
