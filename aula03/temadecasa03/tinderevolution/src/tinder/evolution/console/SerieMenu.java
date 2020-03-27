package tinder.evolution.console;

import tinder.evolution.dominio.CategoriaSerie;
import tinder.evolution.dominio.Serie;
import tinder.evolution.gerenciador.SerieGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class SerieMenu {

    private SerieGerenciador gerenciador;

    public SerieMenu() {
        this.gerenciador = new SerieGerenciador();
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

    public Serie create() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriação de Série...");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.print("Número de temporadas: ");
        int numeroTemporadas = scanner.nextInt();

        System.out.print("Número de episódios: ");
        int numeroEpisodios = scanner.nextInt();

        System.out.println("Categoria: ");
        System.out.println("[A] AÇAO");
        System.out.println("[C] COMÉDIA");
        System.out.println("[D] DRAMA");
        System.out.println("[SC] SITCOM");
        System.out.println("[S] SUSPENSE");
        System.out.println("[T] TERROR");
        System.out.print("> ");
        String categoria = scanner.next();

        CategoriaSerie categoriaSerie;
        switch (categoria) {
            case "A":
                categoriaSerie = CategoriaSerie.ACAO;
                break;
            case "C":
                categoriaSerie = CategoriaSerie.COMEDIA;
                break;
            case "D":
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
            case "SC":
                categoriaSerie = CategoriaSerie.SITCOM;
                break;
            case "S":
                categoriaSerie = CategoriaSerie.SUSPENSE;
                break;
            case "T":
                categoriaSerie = CategoriaSerie.TERROR;
                break;
            default:
                categoriaSerie = CategoriaSerie.ACAO;
                break;
        }

        scanner.nextLine(); // Consumir nova linha estante
        System.out.print("Sinopse: ");
        String sinopse = scanner.nextLine();

        Serie serie = new Serie(nome, diretor, LocalDate.of(ano, mes, dia), numeroTemporadas, numeroEpisodios, categoriaSerie, sinopse);
        return gerenciador.salvar(serie);

    }

    public Serie editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de Série...");
        System.out.println("Qual série deseja editar?");

        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println("[" + serie.getId() + "] - " + serie.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt(); scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.print("Número de temporadas: ");
        int numeroTemporadas = scanner.nextInt();

        System.out.print("Número de episódios: ");
        int numeroEpisodios = scanner.nextInt();

        System.out.println("Categoria: ");
        System.out.println("[A] AÇAO");
        System.out.println("[C] COMÉDIA");
        System.out.println("[D] DRAMA");
        System.out.println("[SC] SITCOM");
        System.out.println("[S] SUSPENSE");
        System.out.println("[T] TERROR");
        System.out.print("> ");
        String categoria = scanner.next();

        CategoriaSerie categoriaSerie;
        switch (categoria) {
            case "A":
                categoriaSerie = CategoriaSerie.ACAO;
                break;
            case "C":
                categoriaSerie = CategoriaSerie.COMEDIA;
                break;
            case "D":
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
            case "SC":
                categoriaSerie = CategoriaSerie.SITCOM;
                break;
            case "S":
                categoriaSerie = CategoriaSerie.SUSPENSE;
                break;
            case "T":
                categoriaSerie = CategoriaSerie.TERROR;
                break;
            default:
                categoriaSerie = CategoriaSerie.ACAO;
                break;
        }

        scanner.nextLine(); // Consumir nova linha estante
        System.out.print("Sinopse: ");
        String sinopse = scanner.nextLine();

        Serie atualizacao = new Serie(nome, diretor, LocalDate.of(ano, mes, dia), numeroTemporadas, numeroEpisodios, categoriaSerie, sinopse);

        Serie serieAtualizada = gerenciador.editar(id, atualizacao);

        if (serieAtualizada == null) {
            System.out.println("Série não encontrada.");
        } else {
            System.out.println(serieAtualizada);
        }

        return serieAtualizada;
    }

    private List<Serie> listar() {

        System.out.println("\nListagem de Série...");
        List<Serie> series = gerenciador.listar();

        for (Serie serie : series) {
            System.out.println(serie);
        }

        return series;

    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Série...");
        System.out.println("Qual o código da série? ");

        System.out.print("> ");
        int id = scanner.nextInt();

        Serie serie = gerenciador.procurar(id);

        if (serie == null) {
            System.out.println("Série não encontrada.");
        } else {
            System.out.println(serie);
        }
    }

    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Série...");
        System.out.println("Qual série deseja deletar?");

        List<Serie> series = gerenciador.listar();
        for (Serie serie : series) {
            System.out.println("[" + serie.getId() + "] - " + serie.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Série deletada.");
        } else {
            System.out.println("Série não encontrada.");
        }

    }
}
