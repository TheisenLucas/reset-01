public class AppCombate {

    public static void main(String[] args) {

        // Declaração dos Personagens

        Guerreiro eadlet = new Guerreiro("Eadlet", 1000, 90, 90);
        Barbaro ogar = new Barbaro("Ogar", 1000, 110, 110);
        Mago radagast = new Mago("Radagast", 1000, 150, 180,45);
        Feiticeiro lockbor = new Feiticeiro("Lockbor",1000,140,180,40);
        Druida cloris = new Druida("Cloris",1000,120,170,40);
        Clerigo antero = new Clerigo("Antero",1000,110,200,60);

        //Declaração das Armas, Magias e Poderes

        Arma espadaLonga = new Arma("Espada Longa", 4);
        Arma machado = new Arma("Machado", 3);
        Magia bolaDeFogo = new Magia("Bola de Fogo", 7, 15);
        Magia feiticoDaDor = new Magia("Feitiço da dor", 6, 12);
        PoderDivino loboFantasma = new PoderDivino("Lobo Fantasma", 7, 18);
        PoderDivino armaEspiritual = new PoderDivino("Arma Espiritual", 8, 16);

        //Declaração Rodada de Ataque 01

        System.out.println("...Os personagens se encontram na floresta e os assuntos mal resolvidos na taberna terão de ser solucionados em combate!\n");
        System.out.println("Resultado da primeira rodada de ataques \n");

        eadlet.atacar(ogar, espadaLonga);
        radagast.atacar(lockbor, bolaDeFogo);
        cloris.atacar(antero, loboFantasma);
        ogar.atacar(radagast, machado);
        lockbor.atacar(cloris, feiticoDaDor);
        antero.atacar(eadlet, armaEspiritual);

        //Status dos personagens após primeira rodada

        System.out.println("\nStatus dos personagens após a primeira rodada de ataques \n");

        eadlet.imprimirEstado();
        ogar.imprimirEstado();
        radagast.imprimirEstado();
        lockbor.imprimirEstado();
        cloris.imprimirEstado();
        antero.imprimirEstado();

        //Declaração Rodada de Ataque 02

        System.out.println("\nA batalha sangrenta continua... \n");
        System.out.println("Resultado da segunda rodada de ataques\n");

        eadlet.atacar(antero, espadaLonga);
        ogar.atacar(lockbor, machado);
        radagast.atacar(cloris, bolaDeFogo);
        lockbor.atacar(eadlet, feiticoDaDor);
        cloris.atacar(ogar, loboFantasma);
        antero.atacar(radagast, armaEspiritual);

        //Status dos personagens após primeira rodada

        System.out.println("Status dos personagens após a segunda rodada de ataques \n");

        eadlet.imprimirEstado();
        ogar.imprimirEstado();
        radagast.imprimirEstado();
        lockbor.imprimirEstado();
        cloris.imprimirEstado();
        antero.imprimirEstado();
    }
}
