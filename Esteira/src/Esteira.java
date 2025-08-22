public class Esteira {

    String marca;

    boolean ligada;

    int velocidadeatual;

    //construtor: define essas caracteristicas como padrões iniciais
    public Esteira(String marca) {
        this.marca = marca;
        this.ligada = false;
        this.velocidadeatual = 0;
    }

    public void ligar() {
        if (ligada == false) {
            ligada = true;
            System.out.println("A esteira foi ligada");
            velocidadeatual = 1;
            System.out.println("Velocide  atual: " + velocidadeatual);
        } else {
            System.out.println("A esteira já está ligada");
        }
    }

    public void desligar() {
        if (ligada == true) {
            ligada = false;
            System.out.println("A esteira foi desligada");
            velocidadeatual = 0;
        }else{
            System.out.println("A esteira já está desligada");
        }
    }
    public void acelerar(int aumentarvelocidade) {
        if(ligada == true) {
            velocidadeatual += aumentarvelocidade;
            System.out.println("A esteira foi acelerada em: " + aumentarvelocidade);
        }else {
            System.out.println("A esteira não foi acelerada, pois está desligada");
        }
    }
    public void desacelerar(int reduzirvelocidade) {
        if(ligada == true) {
            velocidadeatual -= reduzirvelocidade;
            System.out.println("A velocidade foi reduzida em: " + reduzirvelocidade);
         }if(velocidadeatual < 0) {
            ligada = false;
            System.out.println("A esteira não atinge números negativos, irá ser desligada");
            velocidadeatual = 0;
        }
        }
        public void exibirinformacoes(){
        System.out.println("\nMarca da esteira: " + marca);
        System.out.println("Status de energia: " + ligada);
        System.out.println("Velocidade atual: " + velocidadeatual);
        }
    }

