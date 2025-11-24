public class Livros {
    private String titulodolivro;
    private String autor;
    private int numerodepaginas;

    public Livros(String titulodolivro, String autor, int numerodepaginas) {
        this.titulodolivro = titulodolivro;
        this.autor = autor;
        this.numerodepaginas = numerodepaginas;
    }

    @Override
    public String toString() {
        return "Livros{nome" +  titulodolivro + '\'' +
                ", autor='" + autor + '\'' +
                ", numerodepaginas=" + numerodepaginas +
                '}';
    }
}
