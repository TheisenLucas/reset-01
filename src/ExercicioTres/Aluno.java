package ExercicioTres;

public class Aluno {

    String nome;

    double notaFinal;

    Aluno(String nome, double notaFinal) {
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    boolean verificarAprovacao() {
        return notaFinal >= 7;
    }

}
