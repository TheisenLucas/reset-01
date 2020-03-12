package temadecasaaula01;

public class Combate {

    public static void main(String[] args) {

        // Declaração dos Personagens

        Guerreiros eadlet = new Guerreiros("Eadlet", 1000, 150, 90);
        Barbaros ogar = new Barbaros("Ogar", 1000, 170, 110);
        Magos radagast = new Magos("Radagast", 1000, 200, 180,45);
        Feiticeiros lockbor = new Feiticeiros("Lockbor",1000,180,180,40);
        Druidas cloris = new Druidas("Cloris",1000,150,170,40);
        Clerigos antero = new Clerigos("Antero",1000,120,200,60);

        //Declaração das Armas, Magias e Poderes

        Armas espadaLonga = new Armas("Espada Longa", 4);
        Armas machado = new Armas("Machado", 3);
        Magias bolaDeFogo = new Magias("Bola de Fogo", 7, 11);
        Magias feiticoDaDor = new Magias("Feitiço da dor", 6, 8);
        Poderes loboFantasma = new Poderes("Lobo Fantasma", 7, 6);
        Poderes armaEspiritual = new Poderes("Arma Espiritual", 8, 8);

        //Declaração Rodada de Ataque 01

        int eadletVsOgar = ogar.vida - eadlet.atacar(espadaLonga.poderAtaqueArma, eadlet.ataque, ogar.defesa);
        ogar.vida = eadletVsOgar;
        int radagastVsLockbor = lockbor.vida - radagast.atacar(bolaDeFogo.poderMagia, radagast.ataque, lockbor.defesa);
        lockbor.vida = radagastVsLockbor;
        int clorisVsAntero = antero.vida - cloris.atacar(loboFantasma.intesidadePoderDivino, cloris.ataque, antero.defesa);
        antero.vida = clorisVsAntero;
        int ogarVsRadagast = radagast.vida - ogar.atacar(machado.poderAtaqueArma, ogar.ataque, radagast.defesa);
        radagast.vida = ogarVsRadagast;
        int lockborVsCloris = cloris.vida - lockbor.atacar(feiticoDaDor.poderMagia, lockbor.ataque, cloris.defesa);
        cloris.vida = lockborVsCloris;
        int anteroVsEadlet = eadlet.vida - antero.atacar(armaEspiritual.intesidadePoderDivino,antero.ataque, eadlet.defesa);
        eadlet.vida = anteroVsEadlet;

        //Declaração Rodada de Ataque 02

        /*int eadletVsAntero = antero.vida - eadlet.atacar(espadaLonga.poderAtaqueArma, eadlet.ataque, antero.defesa);
        antero.vida = eadletVsAntero;
        int ogarVsRadagast = radagast.vida - ogar.atacar(machado.poderAtaqueArma, ogar.ataque, radagast.defesa);
        radagast.vida = ogarVsRadagast;
        int radagastVsLockbor = lockbor.vida - radagast.atacar(bolaDeFogo.poderMagia, radagast.ataque, lockbor.defesa);
        lockbor.vida = radagastVsLockbor;
        int lockborVsCloris = radagast.vida - ogar.atacar(machado.poderAtaqueArma, ogar.ataque, radagast.defesa);
        radagast.vida = ogarVsRadagast;
        int clorisVsAntero = cloris.vida - lockbor.atacar(feiticoDaDor.poderMagia, lockbor.ataque, cloris.defesa);
        cloris.vida = lockborVsCloris;
        int anteroVsOgar = eadlet.vida - antero.atacar(armaEspiritual.intesidadePoderDivino,antero.ataque, eadlet.defesa);
        eadlet.vida = anteroVsEadlet; */


        //Declaração dos ataques

        System.out.println("...Os personagens se encontram na floresta e os desentendimentos terão de ser resolvidos!");
        System.out.println("O guerreiro Eadlet desenpunha sua espada longa e desfere um golpe contra Ogar, o bárbaro.");
        System.out.println(eadlet.nome + " atacou " + ogar.nome + " com " + espadaLonga.nomeArma + " causando " + (1000 - eadletVsOgar) + " de dano");

        //Status dos personagens
    }
}
