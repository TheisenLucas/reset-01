package exercico1;

public class Aluno {

    private final String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void obterNota(){
        System.out.println("Obter Nota");
    }

    private void montarCola(){
        System.out.println("Montar Cola");
    }


}
