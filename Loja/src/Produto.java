public class Produto {

    private String nomeDoProduto;
    private double preco;
    private int qtd;

    public Produto(String nomeDoProduto, double preco, int qtd){
        this.nomeDoProduto = nomeDoProduto;
        this.preco = preco;
        this.qtd = qtd;
    }
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeDoProduto='" + nomeDoProduto + '\'' +
                ", preco=" + preco +
                ", qtd=" + qtd +
                '}';
    }
}
