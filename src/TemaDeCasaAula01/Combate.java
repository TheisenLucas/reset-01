package TemaDeCasaAula01;

public class Combate {

    public static void main(String[] args) {

        System.out.println("...Os personagens se encontram na floresta e os desentendimentos terão de ser resolvidos!");

        Guerreiros Eadlet = new Guerreiros("Eadlet", 100, 150, 90);
        Barbaros Ogar = new Barbaros("Ogar", 100, 170, 110);
        Magos Radagast = new Magos("Radagast", 100, 200, 180,45);
        Feiticeiros Lockbor = new Feiticeiros("Lockbor",100,180,180,40);
        Druidas Cloris = new Druidas("Cloris",100,150,170,40);
        Clerigos Antero = new Clerigos("Antero",100,120,200,60);

        System.out.println("O guerreiro Eadlet desenpunha sua espada longa e desfere um golpe contra Ogar, o bárbaro.");

        new Atacar()
    }
}
