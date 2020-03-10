package TemaDeCasaAula01;

public class Magos {

    String nome;

    int vida;

    int ataque;

    int defesa;

    int mana;

    Magos(String nome, int vida, int ataque, int defesa, int mana) {
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
