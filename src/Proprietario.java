import java.util.ArrayList;
import java.util.List;

public class Proprietario {
    private String nome;
    private List<Veiculo> veiculos = new ArrayList<>();

    public Proprietario(String nome) {
        this.nome = nome;
    }
    public void adicionarVeiculo(Veiculo v){
        veiculos.add(v);
    }
    public void listarVeiculos(){
        System.out.println("\n ==== Resumo dos veiculos ====");
        System.out.println("Veiculos de "+ nome);

        double total = 0.0;

        for(Veiculo v: veiculos){
            System.out.println(v);
            total += v.calcularImposto();
        }
        System.out.println(total);
    }

}
