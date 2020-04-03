package br.com.cwi.tinderevolution.console;

import br.com.cwi.tinderevolution.dominio.curiosidade.CategoriaCuriosidade;
import br.com.cwi.tinderevolution.dominio.curiosidade.Curiosidade;
import br.com.cwi.tinderevolution.gerenciador.CuriosidadeGerenciador;

import java.util.List;
import java.util.Scanner;

public class CuriosidadeMenu {

    private CuriosidadeGerenciador gerenciador;

    public CuriosidadeMenu() {
        this.gerenciador = new CuriosidadeGerenciador();
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

    public Curiosidade create() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriação de Curiosidade...");

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.println("Categoria: ");
        System.out.println("[AL] ALIMENTAÇÂO");
        System.out.println("[AP] APARÊNCIA");
        System.out.println("[C] COMPORTAMENTO");
        System.out.println("[E] EVENTO");
        System.out.print("> ");
        String categoria = scanner.next();

        CategoriaCuriosidade categoriaCuriosidade;
        switch (categoria) {
            case "AL":
                categoriaCuriosidade = CategoriaCuriosidade.ALIMENTACAO;
                break;
            case "AP":
                categoriaCuriosidade = CategoriaCuriosidade.APARENCIA;
                break;
            case "C":
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
            case "E":
                categoriaCuriosidade = CategoriaCuriosidade.EVENTO;
                break;
            default:
                categoriaCuriosidade = CategoriaCuriosidade.ALIMENTACAO;
                break;
        }

        Curiosidade curiosidade = new Curiosidade(descricao, categoriaCuriosidade);
        return gerenciador.salvar(curiosidade);

    }

    public Curiosidade editar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de Curiosidade...");
        System.out.println("Qual curiosidade deseja editar?");

        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println("[" + curiosidade.getId() + "] - " + curiosidade.getDescricao());
        }

        System.out.print("> ");
        int id = scanner.nextInt(); scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.println("Categoria: ");
        System.out.println("[AL] ALIMENTAÇÂO");
        System.out.println("[AP] APARÊNCIA");
        System.out.println("[C] COMPORTAMENTO");
        System.out.println("[E] EVENTO");
        System.out.print("> ");
        String categoria = scanner.next();

        CategoriaCuriosidade categoriaCuriosidade;
        switch (categoria) {
            case "AL":
                categoriaCuriosidade = CategoriaCuriosidade.ALIMENTACAO;
                break;
            case "AP":
                categoriaCuriosidade = CategoriaCuriosidade.APARENCIA;
                break;
            case "C":
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
            case "E":
                categoriaCuriosidade = CategoriaCuriosidade.EVENTO;
                break;
            default:
                categoriaCuriosidade = CategoriaCuriosidade.ALIMENTACAO;
                break;
        }

        Curiosidade atualizacao = new Curiosidade(descricao, categoriaCuriosidade);

        Curiosidade curiosidadeAtualizada = gerenciador.editar(id, atualizacao);

        if (curiosidadeAtualizada == null) {
            System.out.println("Curiosidade não encontrada.");
        } else {
            System.out.println(curiosidadeAtualizada);
        }

        return curiosidadeAtualizada;
    }

    private List<Curiosidade> listar() {

        System.out.println("\nListagem de Curiosidade...");
        List<Curiosidade> curiosidades = gerenciador.listar();

        for (Curiosidade curiosidade : curiosidades) {
            System.out.println(curiosidade);
        }

        return curiosidades;

    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa de Curiosidade...");
        System.out.println("Qual o código da curiosidade? ");

        System.out.print("> ");
        int id = scanner.nextInt();

        Curiosidade curiosidade = gerenciador.procurar(id);

        if (curiosidade == null) {
            System.out.println("Curiosidade não encontrada.");
        } else {
            System.out.println(curiosidade);
        }
    }

    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de Curiosidade...");
        System.out.println("Qual curiosidade deseja deletar?");

        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println("[" + curiosidade.getId() + "] - " + curiosidade.getDescricao());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Curiosidade deletada.");
        } else {
            System.out.println("Curiosidade não encontrada.");
        }
    }
}
