package TemaDeCasaAula01;

public class Feiticeiros {

    String nome;

    int vida;

    int ataque;

    int defesa;

    int mana;

    Feiticeiros(String nome, int vida, int ataque, int defesa, int mana) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
    }

    boolean verificarVida() {
        return vida > 0;
    }

    boolean verificarMana() {
        return mana > 0;
    }
}
