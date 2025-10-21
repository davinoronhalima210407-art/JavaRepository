public class Main {
    public static void main(String[] args) {

        Instrumento[] instrumentos = {
                new Violao(),
                new Piano(),
                new Bateria()
        };
        for(Instrumento i : instrumentos){
            i.tocar();
        }
    }
}
