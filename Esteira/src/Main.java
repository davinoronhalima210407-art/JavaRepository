//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Esteira e1 = new Esteira("Phillips");

        e1.ligar();
        e1.desligar();
        e1.ligar();
        e1.acelerar(20);
        e1.desacelerar(22);
        e1.exibirinformacoes();

    }
}