public class Tenis {

    private String marca;
    private int tamanho;
    private double valor;

    public Tenis(String marca, int tamanho,double valor ){
        this.marca = marca;
        this.tamanho = tamanho;
        this.valor = valor;
    }
    public double calcularDesconto(double desconto){
      return valor - valor*(desconto/100);

    }
    public void exibirinfo(double desconto){
        double valorfinal = calcularDesconto(desconto);

        System.out.println("Marca: "+marca);
        System.out.println("Tamanho: "+tamanho);
        System.out.println("Valor Original: "+valor);
        System.out.println("Preço após o desconto de = " + valorfinal );
    }
}
