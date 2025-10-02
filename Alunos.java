public class Alunos {

    String nome;
    double nota;

    public Alunos(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }
    @Override
    public String toString(){
        return "Nome: " + nome + ", nota: "+ nota;
    }
}

