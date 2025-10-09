import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nomeDaLoja;
    private List<Produto> produtos;

    public Loja(String nomeDaLoja){
        this.nomeDaLoja = nomeDaLoja;
        this.produtos = new ArrayList<>();
    }
    public void addProduto(Produto p){
        produtos.add(p);
    }
    public void listarProdutos(){
        if(produtos.isEmpty()){
            System.out.println("Nenhum produto cadastrado");
        }else {
            for(Produto p : produtos){
                System.out.println(p);
            }
        }
    }
    public double valorTotalEstoque() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco() * p.getQtd();
        }
        return total;
    }
    public Produto produtoMaisCaro(){
        if(produtos.isEmpty()){
            return null;
        }
        Produto maiscaro = produtos.get(0);
        for(Produto p : produtos){
            if(p.getPreco() > maiscaro.getPreco()){
                maiscaro = p;
            }
        }
        return maiscaro;
    }
}
