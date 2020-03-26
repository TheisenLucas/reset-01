package tinder.evolution.console;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        MusicaMenu musicaMenu = new MusicaMenu();
        FilmeMenu filmeMenu = new FilmeMenu();

        Scanner teclado = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção abaixo: ");
            System.out.println("[M] - Músicas");
            System.out.println("[F] - Filmes");
            System.out.println("[X] - Encerrar");
            System.out.print("> ");
            opcao = teclado.next().charAt(0);

            switch (opcao) {
                case 'M':
                    musicaMenu.opcoes();
                    break;
                case 'F':
                    filmeMenu.opcoes();
                    break;
                case 'X':
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
