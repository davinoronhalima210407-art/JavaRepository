//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produto iphone = new Produto("iphone 16",3500,25);
        iphone.setNome( "iphone 15");
        iphone.getNome();
        iphone.setPreco(3000);
        iphone.adicionarEstoque(37);
        iphone.reduzirEstoque(10);
        iphone.exibirinformacoes();

    }
}