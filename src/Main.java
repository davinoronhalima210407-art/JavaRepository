public class Main {
    public static void main(String[] args) {

        Proprietario arnagol = new Proprietario("Jose");

        Veiculo carro = new Carro("gol",10000,120);
        Veiculo moto = new Moto("Yamaha",8000,140);

        arnagol.adicionarVeiculo(carro);
        arnagol.adicionarVeiculo(moto);

        arnagol.listarVeiculos();
    }
}
