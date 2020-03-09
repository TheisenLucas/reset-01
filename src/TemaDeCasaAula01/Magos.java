package TemaDeCasaAula01;

public class Magos {

    String nome;

    int vida;

    int ataque;

    int defesa;

    int mana;

    boolean verificarVida() {
        return vida > 0;
    }

    boolean verificarMana() {
        return mana > 0;
    }
}
