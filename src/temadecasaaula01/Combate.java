package temadecasaaula01;

public class Combate {

    public static void main(String[] args) {

        // Declaração dos Personagens

        Guerreiros eadlet = new Guerreiros("Eadlet", 1000, 90, 90);
        Barbaros ogar = new Barbaros("Ogar", 1000, 110, 110);
        Magos radagast = new Magos("Radagast", 1000, 150, 180,45);
        Feiticeiros lockbor = new Feiticeiros("Lockbor",1000,140,180,40);
        Druidas cloris = new Druidas("Cloris",1000,120,170,40);
        Clerigos antero = new Clerigos("Antero",1000,110,200,60);

        //Declaração das Armas, Magias e Poderes

        Armas espadaLonga = new Armas("Espada Longa", 4);
        Armas machado = new Armas("Machado", 3);
        Magias bolaDeFogo = new Magias("Bola de Fogo", 7, 15);
        Magias feiticoDaDor = new Magias("Feitiço da dor", 6, 12);
        Poderes loboFantasma = new Poderes("Lobo Fantasma", 7, 18);
        Poderes armaEspiritual = new Poderes("Arma Espiritual", 8, 16);

        //Declaração Rodada de Ataque 01

        int eadletVsOgar = eadlet.atacar(espadaLonga.poderAtaqueArma, eadlet.ataque, ogar.defesa);
        ogar.vida = ogar.vida -= eadletVsOgar;

        int radagastVsLockbor = radagast.atacar(bolaDeFogo.poderMagia, radagast.ataque, lockbor.defesa);
        lockbor.vida = lockbor.vida -= radagastVsLockbor;
        radagast.mana = radagast.mana -= bolaDeFogo.custoMana;

        int clorisVsAntero = cloris.atacar(loboFantasma.intesidadePoderDivino, cloris.ataque, antero.defesa);
        antero.vida = antero.vida -= clorisVsAntero;
        cloris.fe = cloris.fe -= loboFantasma.custoFe;

        int ogarVsRadagast = ogar.atacar(machado.poderAtaqueArma, ogar.ataque, radagast.defesa);
        radagast.vida = radagast.vida -= ogarVsRadagast;

        int lockborVsCloris = lockbor.atacar(feiticoDaDor.poderMagia, lockbor.ataque, cloris.defesa);
        cloris.vida = cloris.vida -= lockborVsCloris;
        lockbor.mana = lockbor.mana -= feiticoDaDor.custoMana;

        int anteroVsEadlet = antero.atacar(armaEspiritual.intesidadePoderDivino,antero.ataque, eadlet.defesa);
        eadlet.vida = eadlet.vida -= anteroVsEadlet;
        antero.fe = antero.fe -= armaEspiritual.custoFe;

        //Declaração dos ataques na primerira rodada

        System.out.println("...Os personagens se encontram na floresta e os assuntos mal resolvidos na taberna terão de ser solucionados em combate!\n");
        System.out.println("Resultado da primeira rodada de ataques \n");
        System.out.println(eadlet.nome + " atacou " + ogar.nome + " com " + espadaLonga.nomeArma + " causando " + eadletVsOgar + " de dano");
        System.out.println(radagast.nome + " atacou " + lockbor.nome + " com " + bolaDeFogo.nomeMagia + " causando " + radagastVsLockbor + " de dano");
        System.out.println(cloris.nome + " atacou " + antero.nome + " com " + loboFantasma.nomePoderDivino + " causando " + clorisVsAntero + " de dano");
        System.out.println(ogar.nome + " atacou " + radagast.nome + " com " + machado.nomeArma + " causando " + ogarVsRadagast + " de dano");
        System.out.println(lockbor.nome + " atacou " + cloris.nome + " com " + feiticoDaDor.nomeMagia + " causando " + lockborVsCloris + " de dano");
        System.out.println(antero.nome + " atacou " + eadlet.nome + " com " + armaEspiritual.nomePoderDivino + " causando " + anteroVsEadlet + " de dano\n");

        //Status dos personagens após primeira rodada
        System.out.println("Status dos personagens após a primeira rodada de ataques \n");
        System.out.println("Guerreiro " + eadlet.nome + ", " + "Vida = " + eadlet.vida);
        System.out.println("Bárbaro " + ogar.nome + ", " + "Vida = " + ogar.vida);
        System.out.println("Mago " + radagast.nome + ", " + "Vida = " + radagast.vida + ", " + "Mana = " + radagast.mana);
        System.out.println("Feiticeiro " + lockbor.nome + ", " + "Vida = " + lockbor.vida + ", " + "Mana = " + lockbor.mana);
        System.out.println("Druida " + cloris.nome + ", " + "Vida = " + cloris.vida + ", " + "Fé = " + cloris.fe);
        System.out.println("Clérigo " + antero.nome + ", " + "Vida = " + antero.vida + ", " + "Fé = " + antero.fe + "\n");

        //Declaração Rodada de Ataque 02

        int eadletVsAntero = eadlet.atacar(espadaLonga.poderAtaqueArma, eadlet.ataque, antero.defesa);
        antero.vida = antero.vida -= eadletVsAntero;

        int ogarVsLockbor = ogar.atacar(machado.poderAtaqueArma, ogar.ataque, lockbor.defesa);
        lockbor.vida = lockbor.vida -= ogarVsLockbor;

        int radagastVsCloris = radagast.atacar(bolaDeFogo.poderMagia, radagast.ataque, cloris.defesa);
        cloris.vida = cloris.vida -= radagastVsCloris;
        radagast.mana = radagast.mana -= bolaDeFogo.custoMana;

        int lockborVsEadlet = lockbor.atacar(feiticoDaDor.poderMagia, lockbor.ataque, eadlet.defesa);
        eadlet.vida = eadlet.vida -= lockborVsCloris;
        lockbor.mana = lockbor.mana -= feiticoDaDor.custoMana;

        int clorisVsOgar = cloris.atacar(loboFantasma.intesidadePoderDivino, cloris.ataque, ogar.defesa);
        ogar.vida = ogar.vida -= clorisVsOgar;
        cloris.fe = cloris.fe -= loboFantasma.custoFe;

        int anteroVsRadagast = antero.atacar(armaEspiritual.intesidadePoderDivino, antero.ataque, radagast.defesa);
        radagast.vida = radagast.vida -= anteroVsRadagast;
        antero.fe = antero.fe -= armaEspiritual.custoFe;

        //Declaração dos ataques na segunda rodada

        System.out.println("A batalha sangrenta continua... \n");
        System.out.println("Resultado da segunda rodada de ataques\n");
        System.out.println(eadlet.nome + " atacou " + antero.nome + " com " + espadaLonga.nomeArma + " causando " + eadletVsAntero + " de dano");
        System.out.println(ogar.nome + " atacou " + lockbor.nome + " com " + machado.nomeArma + " causando " + ogarVsLockbor + " de dano");
        System.out.println("O feiticeiro " + lockbor.nome + " morreu!"); lockbor.vida = 0;
        System.out.println(radagast.nome + " atacou " + cloris.nome + " com " + bolaDeFogo.nomeMagia + " causando " + radagastVsCloris + " de dano");
        System.out.println("A druida " + cloris.nome + " morreu!"); cloris.vida = 0;
        System.out.println(lockbor.nome + " atacou " + eadlet.nome + " com " + feiticoDaDor.nomeMagia + " causando " + lockborVsEadlet + " de dano");
        System.out.println("O guerreiro " + eadlet.nome + " morreu!"); eadlet.vida = 0;
        System.out.println(cloris.nome + " atacou " + ogar.nome + " com " + loboFantasma.nomePoderDivino + " causando " + clorisVsOgar + " de dano");
        System.out.println(antero.nome + " atacou " + radagast.nome + " com " + armaEspiritual.nomePoderDivino + " causando " + anteroVsRadagast + " de dano\n");

        //Status dos personagens após primeira rodada
        System.out.println("Status dos personagens após a segunda rodada de ataques \n");
        System.out.println("Guerreiro " + eadlet.nome + ", " + "Vida = " + eadlet.vida);
        System.out.println("Bárbaro " + ogar.nome + ", " + "Vida = " + ogar.vida);
        System.out.println("Mago " + radagast.nome + ", " + "Vida = " + radagast.vida + ", " + "Mana = " + radagast.mana);
        System.out.println("Feiticeiro " + lockbor.nome + ", " + "Vida = " + lockbor.vida + ", " + "Mana = " + lockbor.mana);
        System.out.println("Druida " + cloris.nome + ", " + "Vida = " + cloris.vida + ", " + "Fé = " + cloris.fe);
        System.out.println("Clérigo " + antero.nome + ", " + "Vida = " + antero.vida + ", " + "Fé = " + antero.fe);

    }
}
