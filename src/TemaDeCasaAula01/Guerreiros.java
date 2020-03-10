package TemaDeCasaAula01;

public class Guerreiros {

    String nome;

    int vida;

    int ataque;

    int defesa;

    Guerreiros(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    boolean verificarVida() {
        return vida > 0;
    }
}
