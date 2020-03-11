package temadecasaaula01;

public class Combate {

    public static void main(String[] args) {

        System.out.println("...Os personagens se encontram na floresta e os desentendimentos terão de ser resolvidos!");

        Guerreiros eadlet = new Guerreiros("Eadlet", 100, 150, 90);
            Armas espadaLonga = new Armas("Espada Longa", 12);

        Barbaros ogar = new Barbaros("Ogar", 100, 170, 110);
            Armas machado = new Armas("Machado", 8);

        Magos radagast = new Magos("Radagast", 100, 200, 180,45);
            Magias bolaDeFogo = new Magias("Bola de Fogo", 16, 11);

        Feiticeiros lockbor = new Feiticeiros("Lockbor",100,180,180,40);
            Magias feiticoDaDor = new Magias("Feitiço da dor", 14, 8);

        Druidas cloris = new Druidas("Cloris",100,150,170,40);
            Poderes loboFantasma = new Poderes("Lobo Fantasma", 15, 6);

        Clerigos antero = new Clerigos("Antero",100,120,200,60);
            Poderes armaEspiritual = new Poderes("Arma Espiritual", 14, 8);

        System.out.println("O guerreiro Eadlet desenpunha sua espada longa e desfere um golpe contra Ogar, o bárbaro.");

        Atacar rodadaAtaque01 = new Atacar(lockbor.nome,ogar.nome);

        //int combate01 = rodadaAtaque01.


    }
}
