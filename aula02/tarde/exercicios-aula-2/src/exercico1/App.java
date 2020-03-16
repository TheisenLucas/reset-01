package exercico1;

public class App {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("nome");
        Turma turma = new Turma();

        aluno.obterNota();
        turma.obterNome();
        turma.obterQuantidadeDeAlunos();

        //aluno.nome = "Joaõ"; //não permite pois nome está privado
    }

}
