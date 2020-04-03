package br.com.cwi.tinderevolution.console;

import br.com.cwi.tinderevolution.dominio.jogo.CategoriaJogo;
import br.com.cwi.tinderevolution.dominio.jogo.Jogo;
import br.com.cwi.tinderevolution.dominio.jogo.PlataformaJogo;
import br.com.cwi.tinderevolution.gerenciador.JogoGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class JogoMenu {

    private JogoGerenciador gerenciador;

    public JogoMenu() {
        this.gerenciador = new JogoGerenciador();
    }

    public void opcoes() {
        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção abaixo:");
            System.out.println("[C] Criar");
            System.out.println("[E] Editar");
            System.out.println("[L] Listar");
            System.out.println("[P] Procurar");
            System.out.println("[D] Deletar");
            System.out.println("[X] Voltar");
            System.out.print("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'C':
                    create();
                    break;
                case 'E':
                    editar();
                    break;
                case 'L':
                    listar();
                    break;
                case 'P':
                    procurar();
                    break;
                case 'D':
                    deletar();
                    break;
                case 'X':
                    System.out.println("...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public Jogo create() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriação de Jogo...");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Categoria: ");
        System.out.println("[A] AÇAO");
        System.out.println("[C] COMÉDIA");
        System.out.println("[D] DRAMA");
        System.out.println("[M] MUSICAL");
        System.out.println("[S] SUSPENSE");
        System.out.println("[T] TERROR");
        System.out.print("> ");
        String categoria = scanner.next();

        CategoriaJogo categoriaJogo;
        switch (categoria) {
            case "A":
                categoriaJogo = CategoriaJogo.ACAO;
                break;
            case "C":
                categoriaJogo = CategoriaJogo.COMEDIA;
                break;
            case "D":
                categoriaJogo = CategoriaJogo.DRAMA;
                break;
            case "M":
                categoriaJogo = CategoriaJogo.MUSICAL;
                break;
            case "S":
                categoriaJogo = CategoriaJogo.SUSPENSE;
                break;
            case "T":
                categoriaJogo = CategoriaJogo.TERROR;
                break;
            default:
                categoriaJogo = CategoriaJogo.ACAO;
                break;
        }

        scanner.nextLine(); // Consumir nova linha estante

        System.out.println("Plataforma: ");
        System.out.println("[1] PC");
        System.out.println("[2] PS4");
        System.out.println("[3] SNES");
        System.out.println("[4] XBOX");
        System.out.print("> ");
        int plataforma = scanner.nextInt();

        PlataformaJogo plataformaJogo;
        switch (plataforma) {
            case 1:
                plataformaJogo = PlataformaJogo.PC;
                break;
            case 2:
                plataformaJogo = PlataformaJogo.PS4;
                break;
            case 3:
                plataformaJogo = PlataformaJogo.SNES;
                break;
            case 4:
                plataformaJogo = PlataformaJogo.XBOX;
                break;
            default:
                plataformaJogo = PlataformaJogo.PC;
                break;
        }

        Jogo jogo = new Jogo(nome, publisher, LocalDate.of(ano, mes, dia), categoriaJogo, plataformaJogo);
        return gerenciador.salvar(jogo);

    }

    public Jogo editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de Jogo...");
        System.out.println("Qual jogo deseja editar?");

        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println("[" + jogo.getId() + "] - " + jogo.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Categoria: ");
        System.out.println("[A] AÇAO");
        System.out.println("[C] COMÉDIA");
        System.out.println("[D] DRAMA");
        System.out.println("[M] MUSICAL");
        System.out.println("[S] SUSPENSE");
        System.out.println("[T] TERROR");
        System.out.print("> ");
        String categoria = scanner.next();

        CategoriaJogo categoriaJogo;
        switch (categoria) {
            case "A":
                categoriaJogo = CategoriaJogo.ACAO;
                break;
            case "C":
                categoriaJogo = CategoriaJogo.COMEDIA;
                break;
            case "D":
                categoriaJogo = CategoriaJogo.DRAMA;
                break;
            case "M":
                categoriaJogo = CategoriaJogo.MUSICAL;
                break;
            case "S":
                categoriaJogo = CategoriaJogo.SUSPENSE;
                break;
            case "T":
                categoriaJogo = CategoriaJogo.TERROR;
                break;
            default:
                categoriaJogo = CategoriaJogo.ACAO;
                break;
        }

        scanner.nextLine(); // Consumir nova linha estante

        System.out.println("Plataforma: ");
        System.out.println("[1] PC");
        System.out.println("[2] PS4");
        System.out.println("[3] SNES");
        System.out.println("[4] XBOX");
        System.out.print("> ");
        int plataforma = scanner.nextInt();

        PlataformaJogo plataformaJogo;
        switch (plataforma) {
            case 1:
                plataformaJogo = PlataformaJogo.PC;
                break;
            case 2:
                plataformaJogo = PlataformaJogo.PS4;
                break;
            case 3:
                plataformaJogo = PlataformaJogo.SNES;
                break;
            case 4:
                plataformaJogo = PlataformaJogo.XBOX;
                break;
            default:
                plataformaJogo = PlataformaJogo.PC;
                break;
        }

        Jogo atualizacao = new Jogo(nome, publisher, LocalDate.of(ano, mes, dia), categoriaJogo, plataformaJogo);

        Jogo jogoAtualizado = gerenciador.editar(id, atualizacao);

        if (jogoAtualizado == null) {
            System.out.println("Jogo não encontrado.");
        } else {
            System.out.println(jogoAtualizado);
        }

        return jogoAtualizado;
    }

    private List<Jogo> listar() {

        System.out.println("\nListagem de Jogo...");
        List<Jogo> jogos = gerenciador.listar();

        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }

        return jogos;

    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Jogo...");
        System.out.println("Qual o código do jogo? ");

        System.out.print("> ");
        int id = scanner.nextInt();

        Jogo jogo = gerenciador.procurar(id);

        if (jogo == null) {
            System.out.println("Jogo não encontrado.");
        } else {
            System.out.println(jogo);
        }
    }

    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Jogo...");
        System.out.println("Qual jogo deseja deletar?");

        List<Jogo> jogos = gerenciador.listar();
        for (Jogo jogo : jogos) {
            System.out.println("[" + jogo.getId() + "] - " + jogo.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Jogo deletado.");
        } else {
            System.out.println("Jogo não encontrado.");
        }

    }

}
