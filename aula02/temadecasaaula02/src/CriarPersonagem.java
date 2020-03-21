/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CriarPersonagem extends Personagem {

    public CriarPersonagem(final String nome, final double vida, final double ataque, final double defesa) {
        super(nome, vida, ataque, defesa);
    }

    List<Personagem> personagens = new ArrayList<>();

    Scanner console = new Scanner(System.in);

    int opcao = 0;

    while(opcao !=7) {

        Menu.imprimeMenu();

        opcao = console.nextInt();

        switch (opcao) {
            case 1:
                Guerreiro = new Guerreiro();
                break;

            case 2:
                Barbaro = new Barbaro();
                break;

            case 3:
                Mago = new Guerreiro();
                break;

            case 4:
                Feiticeiro = new Guerreiro();
                break;

            case 5:
                Druida = new Guerreiro();
                break;

            case 6:
                Clerigo = new Guerreiro();
                break;

            case 7:
                System.out.println("Sistema Encerrado \n");
                break;

            default:
                System.out.println("Opção Invalida \n");
                break;
        }
    }

}
*/