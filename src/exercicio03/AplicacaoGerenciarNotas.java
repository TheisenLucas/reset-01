package exercicio03;

public class AplicacaoGerenciarNotas {

    public static void main(String[] args) {

        Aluno nomeDoAluno1 = new Aluno("Lucas", 8.5);

        boolean situacaoDeAprovação1 = nomeDoAluno1.verificarAprovacao();
        System.out.println("Nome do aluno: " + nomeDoAluno1.nome);
        System.out.println("Nota final do aluno: " + nomeDoAluno1.notaFinal);
        System.out.println("O aluno está aprovado? " + situacaoDeAprovação1);

        Aluno nomeDoAluno2 = new Aluno("Luis", 4);

        boolean situacaoDeAprovação2 = nomeDoAluno2.verificarAprovacao();
        System.out.println("Nome do aluno: " + nomeDoAluno2.nome);
        System.out.println("Nota final do aluno: " + nomeDoAluno2.notaFinal);
        System.out.println("O aluno está aprovado? " + situacaoDeAprovação2);

        Aluno nomeDoAluno3 = new Aluno("Rafael", 6.9);

        boolean situacaoDeAprovação3 = nomeDoAluno3.verificarAprovacao();
        System.out.println("Nome do aluno: " + nomeDoAluno3.nome);
        System.out.println("Nota final do aluno: " + nomeDoAluno3.notaFinal);
        System.out.println("O aluno está aprovado? " + situacaoDeAprovação3);

        Aluno nomeDoAluno4 = new Aluno("Milena", 9.2);

        boolean situacaoDeAprovação4 = nomeDoAluno4.verificarAprovacao();
        System.out.println("Nome do aluno: " + nomeDoAluno4.nome);
        System.out.println("Nota final do aluno: " + nomeDoAluno4.notaFinal);
        System.out.println("O aluno está aprovado? " + situacaoDeAprovação4);
    }
}
